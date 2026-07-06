package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.EstadoEventoEntity;
import com.example.demo.service.EstadoEventoService;
import java.util.List;

@RestController
@RequestMapping("/api/catalogo/estadoevento")
@RequiredArgsConstructor
public class EstadoEventoController {

    private final EstadoEventoService service;

    @GetMapping
    public List<EstadoEventoEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstadoEventoEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<EstadoEventoEntity> guardar(@RequestBody EstadoEventoEntity entity) {
        entity.setId(null);
        EstadoEventoEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EstadoEventoEntity> actualizar(@PathVariable Integer id, @RequestBody EstadoEventoEntity entity) {
        return service.buscarPorId(id).map(ev -> {
            ev.setNombre(entity.getNombre());
            ev.setEstado(entity.getEstado());
            return ResponseEntity.ok(service.actualizar(ev));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(ev -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
