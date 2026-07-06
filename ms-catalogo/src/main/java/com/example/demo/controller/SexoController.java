package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.SexoEntity;
import com.example.demo.service.SexoService;
import java.util.List;

@RestController
@RequestMapping("/api/catalogo/sexo")
@RequiredArgsConstructor
public class SexoController {

    private final SexoService service;

    @GetMapping
    public List<SexoEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SexoEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<SexoEntity> guardar(@RequestBody SexoEntity entity) {
        entity.setId(null);
        SexoEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SexoEntity> actualizar(@PathVariable Integer id, @RequestBody SexoEntity entity) {
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
