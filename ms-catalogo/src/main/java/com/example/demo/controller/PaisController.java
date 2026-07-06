package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.PaisEntity;
import com.example.demo.service.PaisService;
import java.util.List;

@RestController
@RequestMapping("/api/catalogo/pais")
@RequiredArgsConstructor
public class PaisController {

    private final PaisService service;

    @GetMapping
    public List<PaisEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaisEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PaisEntity> guardar(@RequestBody PaisEntity entity) {
        entity.setId(null);
        PaisEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PaisEntity> actualizar(@PathVariable Integer id, @RequestBody PaisEntity entity) {
        return service.buscarPorId(id).map(p -> {
            p.setNombre(entity.getNombre());
            p.setEstado(entity.getEstado());
            return ResponseEntity.ok(service.actualizar(p));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(p -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
