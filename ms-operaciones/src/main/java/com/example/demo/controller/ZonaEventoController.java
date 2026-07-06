package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.ZonaEvento;
import com.example.demo.service.ZonaEventoService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/operaciones/zonaevento")
@RequiredArgsConstructor
public class ZonaEventoController {

    private final ZonaEventoService service;

    @GetMapping
    public List<ZonaEvento> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ZonaEvento> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ZonaEvento> guardar(@RequestBody ZonaEvento entidad) {
        entidad.setId(null);
        ZonaEvento creado = service.guardar(entidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ZonaEvento> actualizar(@PathVariable Integer id, @RequestBody ZonaEvento entidad) {
        return service.buscarPorId(id).map(ze -> {
            ze.setEvento(entidad.getEvento());
            ze.setAforoMaximo(entidad.getAforoMaximo());
            ze.setCategoriaZona(entidad.getCategoriaZona());
            ze.setPrecio(entidad.getPrecio());
            return ResponseEntity.ok(service.actualizar(ze));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(ze -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
