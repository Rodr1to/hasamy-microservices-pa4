package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.TipoPersonalEvento;
import com.example.demo.service.TipoPersonalEventoService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/operaciones/tipopersonalevento")
@RequiredArgsConstructor
public class TipoPersonalEventoController {

    private final TipoPersonalEventoService service;

    @GetMapping
    public List<TipoPersonalEvento> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoPersonalEvento> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<TipoPersonalEvento> guardar(@RequestBody TipoPersonalEvento entidad) {
        entidad.setId(null);
        TipoPersonalEvento creado = service.guardar(entidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoPersonalEvento> actualizar(@PathVariable Integer id, @RequestBody TipoPersonalEvento entidad) {
        return service.buscarPorId(id).map(tpe -> {
            tpe.setNombre(entidad.getNombre());
            tpe.setEstado(entidad.getEstado());
            return ResponseEntity.ok(service.actualizar(tpe));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(tpe -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
