package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.PermisoRol;
import com.example.demo.service.PermisoRolService;
import java.util.List;

@RestController
@RequestMapping("/api/seguridad/permiso-rol")
@RequiredArgsConstructor
public class PermisoRolController {

    private final PermisoRolService service;

    @GetMapping
    public List<PermisoRol> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{rolId}/{moduloId}")
    public ResponseEntity<PermisoRol> obtenerPorId(@PathVariable Integer rolId, @PathVariable Integer moduloId) {
        return service.buscarPorId(rolId, moduloId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PermisoRol> guardar(@RequestBody PermisoRol permisoRol) {
        PermisoRol creado = service.guardar(permisoRol);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{rolId}/{moduloId}")
    public ResponseEntity<PermisoRol> actualizar(@PathVariable Integer rolId, @PathVariable Integer moduloId, @RequestBody PermisoRol permisoRol) {
        return service.buscarPorId(rolId, moduloId).map(pr -> {
            permisoRol.setRolId(rolId);
            permisoRol.setModuloId(moduloId);
            return ResponseEntity.ok(service.actualizar(permisoRol));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{rolId}/{moduloId}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer rolId, @PathVariable Integer moduloId) {
        return service.buscarPorId(rolId, moduloId).map(pr -> {
            service.eliminar(rolId, moduloId);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}