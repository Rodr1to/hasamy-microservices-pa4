package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.AsignacionPersonalEvento;
import com.example.demo.service.AsignacionPersonalEventoService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/operaciones/asignacionpersonalevento")
@RequiredArgsConstructor
public class AsignacionPersonalEventoController {

    private final AsignacionPersonalEventoService service;

    @GetMapping
    public List<AsignacionPersonalEvento> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AsignacionPersonalEvento> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<AsignacionPersonalEvento> guardar(@RequestBody AsignacionPersonalEvento entidad) {
        entidad.setId(null);
        AsignacionPersonalEvento creado = service.guardar(entidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AsignacionPersonalEvento> actualizar(@PathVariable Integer id, @RequestBody AsignacionPersonalEvento entidad) {
        return service.buscarPorId(id).map(ape -> {
            ape.setEvento(entidad.getEvento());
            ape.setEmpleado(entidad.getEmpleado());
            ape.setTipoPersonal(entidad.getTipoPersonal());
            return ResponseEntity.ok(service.actualizar(ape));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(ape -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
