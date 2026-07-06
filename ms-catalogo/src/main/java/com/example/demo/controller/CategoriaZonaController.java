package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.CategoriaZonaEntity;
import com.example.demo.service.CategoriaZonaService;
import java.util.List;

@RestController
@RequestMapping("/api/catalogo/categoria-zona")
@RequiredArgsConstructor
public class CategoriaZonaController {

    private final CategoriaZonaService service;

    @GetMapping
    public List<CategoriaZonaEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaZonaEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CategoriaZonaEntity> guardar(@RequestBody CategoriaZonaEntity entity) {
        entity.setId(null);
        CategoriaZonaEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoriaZonaEntity> actualizar(@PathVariable Integer id, @RequestBody CategoriaZonaEntity entity) {
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
