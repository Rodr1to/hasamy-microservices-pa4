package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Evento;
import com.example.demo.service.EventoService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/operaciones/evento")
@RequiredArgsConstructor
public class EventoController {

    private final EventoService service;

    @GetMapping
    public List<Evento> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evento> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Evento> guardar(@RequestBody Evento entidad) {
        entidad.setId(null);
        Evento creado = service.guardar(entidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Evento> actualizar(@PathVariable Integer id, @RequestBody Evento entidad) {
        return service.buscarPorId(id).map(e -> {
            e.setEstadoEvento( entidad.getEstadoEvento());
            e.setFechaFin( entidad.getFechaFin());
            e.setFechaInicio( entidad.getFechaInicio());
            e.setNombre( entidad.getNombre());
            e.setSede( entidad.getSede());
            return ResponseEntity.ok(service.actualizar(e));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(e -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
