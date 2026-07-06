package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.EstadoVueloEntity;
import com.example.demo.service.EstadoVueloService;
import java.util.List;

@RestController
@RequestMapping("/api/catalogo/estadovuelo")
@RequiredArgsConstructor
public class EstadoVueloController {

    private final EstadoVueloService service;

    @GetMapping
    public List<EstadoVueloEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstadoVueloEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<EstadoVueloEntity> guardar(@RequestBody EstadoVueloEntity entity) {
        entity.setId(null);
        EstadoVueloEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EstadoVueloEntity> actualizar(@PathVariable Integer id, @RequestBody EstadoVueloEntity entity) {
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
