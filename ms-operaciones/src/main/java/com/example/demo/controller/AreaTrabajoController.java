package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.AreaTrabajo;
import com.example.demo.service.AreaTrabajoService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/operaciones/areatrabajo")
@RequiredArgsConstructor
public class AreaTrabajoController {

    private final AreaTrabajoService service;

    @GetMapping
    public List<AreaTrabajo> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AreaTrabajo> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<AreaTrabajo> guardar(@RequestBody AreaTrabajo entidad) {
        entidad.setId(null);
        AreaTrabajo creado = service.guardar(entidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AreaTrabajo> actualizar(@PathVariable Integer id, @RequestBody AreaTrabajo entidad) {
        return service.buscarPorId(id).map(at -> {
            at.setNombre(entidad.getNombre());
            at.setEstado(entidad.getEstado());
            return ResponseEntity.ok(service.actualizar(at));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(at -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
