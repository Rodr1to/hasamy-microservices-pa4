package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Ponente;
import com.example.demo.service.PonenteService;
import java.util.List;

@RestController
@RequestMapping("/api/persona/ponente")
public class PonenteController {

    @Autowired
    private PonenteService service;

    @GetMapping
    public List<Ponente> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ponente> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Ponente guardar(@RequestBody Ponente ponente) {
        return service.actualizar(ponente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ponente> actualizar(@PathVariable Integer id, @RequestBody Ponente ponente) {
        return service.buscarPorId(id).map(existingPonente -> {
            ponente.setId(id);
            return ResponseEntity.ok(service.actualizar(ponente));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(existingPonente -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
