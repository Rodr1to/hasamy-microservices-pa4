package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.EstadoCivilEntity;
import com.example.demo.service.EstadoCivilService;
import java.util.List;

@RestController
@RequestMapping("/api/catalogo/estado-civil")
@RequiredArgsConstructor
public class EstadoCivilController {

    private final EstadoCivilService service;

    @GetMapping
    public List<EstadoCivilEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstadoCivilEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<EstadoCivilEntity> guardar(@RequestBody EstadoCivilEntity entity) {
        entity.setId(null);
        EstadoCivilEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EstadoCivilEntity> actualizar(@PathVariable Integer id, @RequestBody EstadoCivilEntity entity) {
        return service.buscarPorId(id).map(x -> {
            entity.setId(id);
            return ResponseEntity.ok(service.actualizar(entity));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(x -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
