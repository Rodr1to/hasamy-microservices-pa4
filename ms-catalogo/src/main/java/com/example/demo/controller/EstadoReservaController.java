package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.EstadoReservaEntity;
import com.example.demo.service.EstadoReservaService;
import java.util.List;

@RestController
@RequestMapping("/api/catalogo/estado-reserva")
@RequiredArgsConstructor
public class EstadoReservaController {

    private final EstadoReservaService service;

    @GetMapping
    public List<EstadoReservaEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstadoReservaEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<EstadoReservaEntity> guardar(@RequestBody EstadoReservaEntity entity) {
        entity.setId(null);
        EstadoReservaEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EstadoReservaEntity> actualizar(@PathVariable Integer id, @RequestBody EstadoReservaEntity entity) {
        return service.buscarPorId(id).map(er -> {
            er.setNombre(entity.getNombre());
            er.setEstado(entity.getEstado());
            return ResponseEntity.ok(service.actualizar(er));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(er -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
