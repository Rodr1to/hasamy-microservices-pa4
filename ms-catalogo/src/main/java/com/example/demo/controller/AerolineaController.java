package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.AerolineaEntity;
import com.example.demo.service.AerolineaService;
import java.util.List;

@RestController
@RequestMapping("/api/catalogo/aerolinea")
@RequiredArgsConstructor
public class AerolineaController {

    private final AerolineaService service;

    @GetMapping
    public List<AerolineaEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AerolineaEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<AerolineaEntity> guardar(@RequestBody AerolineaEntity entity) {
        entity.setId(null);
        AerolineaEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AerolineaEntity> actualizar(@PathVariable Integer id, @RequestBody AerolineaEntity entity) {
        return service.buscarPorId(id).map(a -> {
            a.setNombre(entity.getNombre());
            a.setEstado(entity.getEstado());
            return ResponseEntity.ok(service.actualizar(a));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(a -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
