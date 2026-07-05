package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Ponente;
import com.example.demo.service.PonenteService;
import java.util.List;

@RestController
@RequestMapping("/api/persona/ponente")
@RequiredArgsConstructor
public class PonenteController {

    private final PonenteService service;

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
    public ResponseEntity<Ponente> guardar(@RequestBody Ponente ponente) {
        ponente.setId(null);
        Ponente creado = service.guardar(ponente);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ponente> actualizar(@PathVariable Integer id, @RequestBody Ponente ponente) {
        return service.buscarPorId(id).map(p -> {
            ponente.setId(id);
            return ResponseEntity.ok(service.actualizar(ponente));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(p -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
