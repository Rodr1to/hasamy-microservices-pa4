package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.EstadoAsistenciaEntity;
import com.example.demo.service.EstadoAsistenciaService;
import java.util.List;

@RestController
@RequestMapping("/api/catalogo/estadoasistencia")
@RequiredArgsConstructor
public class EstadoAsistenciaController {

    private final EstadoAsistenciaService service;

    @GetMapping
    public List<EstadoAsistenciaEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstadoAsistenciaEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<EstadoAsistenciaEntity> guardar(@RequestBody EstadoAsistenciaEntity entity) {
        entity.setId(null);
        EstadoAsistenciaEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EstadoAsistenciaEntity> actualizar(@PathVariable Integer id, @RequestBody EstadoAsistenciaEntity entity) {
        return service.buscarPorId(id).map(ea -> {
            ea.setNombre(entity.getNombre());
            ea.setEstado(entity.getEstado());
            return ResponseEntity.ok(service.actualizar(ea));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(ea -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
