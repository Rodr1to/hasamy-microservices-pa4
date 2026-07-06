package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.DistritoEntity;
import com.example.demo.service.DistritoService;
import java.util.List;

@RestController
@RequestMapping("/api/catalogo/distrito")
@RequiredArgsConstructor
public class DistritoController {

    private final DistritoService service;

    @GetMapping
    public List<DistritoEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DistritoEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<DistritoEntity> guardar(@RequestBody DistritoEntity entity) {
        entity.setId(null);
        DistritoEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DistritoEntity> actualizar(@PathVariable Integer id, @RequestBody DistritoEntity entity) {
        return service.buscarPorId(id).map(d -> {
            d.setNombre(entity.getNombre());
            d.setEstado(entity.getEstado());
            return ResponseEntity.ok(service.actualizar(d));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(d -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}