package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.ModuloSistema;
import com.example.demo.service.ModuloSistemaService;
import java.util.List;

@RestController
@RequestMapping("/api/seguridad/modulo")
@RequiredArgsConstructor
public class ModuloSistemaController {

    private final ModuloSistemaService service;

    @GetMapping
    public List<ModuloSistema> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ModuloSistema> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ModuloSistema> guardar(@RequestBody ModuloSistema moduloSistema) {
        moduloSistema.setId(null);
        ModuloSistema creado = service.guardar(moduloSistema);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ModuloSistema> actualizar(@PathVariable Integer id, @RequestBody ModuloSistema moduloSistema) {
        return service.buscarPorId(id).map(m -> {
            moduloSistema.setId(id);
            return ResponseEntity.ok(service.actualizar(moduloSistema));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(m -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}