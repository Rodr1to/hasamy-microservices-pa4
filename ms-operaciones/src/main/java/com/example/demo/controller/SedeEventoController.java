package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.SedeEvento;
import com.example.demo.service.SedeEventoService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/operaciones/sedeevento")
@RequiredArgsConstructor
public class SedeEventoController {

    private final SedeEventoService service;

    @GetMapping
    public List<SedeEvento> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SedeEvento> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<SedeEvento> guardar(@RequestBody SedeEvento entidad) {
        entidad.setId(null);
        SedeEvento creado = service.guardar(entidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SedeEvento> actualizar(@PathVariable Integer id, @RequestBody SedeEvento entidad) {
        return service.buscarPorId(id).map(se -> {
            se.setNombre(entidad.getNombre());
            se.setEstado(entidad.getEstado());
            se.setDireccion(entidad.getDireccion());
            se.setDistrito(entidad.getDistrito());
            return ResponseEntity.ok(service.actualizar(se));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(se -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
