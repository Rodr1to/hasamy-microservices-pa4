package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.IncidenciaEvento;
import com.example.demo.service.IncidenciaEventoService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/operaciones/incidenciaevento")
@RequiredArgsConstructor
public class IncidenciaEventoController {

    private final IncidenciaEventoService service;

    @GetMapping
    public List<IncidenciaEvento> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<IncidenciaEvento> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<IncidenciaEvento> guardar(@RequestBody IncidenciaEvento entidad) {
        entidad.setId(null);
        IncidenciaEvento creado = service.guardar(entidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<IncidenciaEvento> actualizar(@PathVariable Integer id, @RequestBody IncidenciaEvento entidad) {
        return service.buscarPorId(id).map(ie -> {
            ie.setEvento(entidad.getEvento());
            ie.setDescripcion(entidad.getDescripcion());
            ie.setEmpleado(entidad.getEmpleado());
            ie.setFecha(entidad.getFecha());
            return ResponseEntity.ok(service.actualizar(ie));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(ie -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
