package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.BancoEntity;
import com.example.demo.service.BancoService;
import java.util.List;

@RestController
@RequestMapping("/api/catalogo/banco")
@RequiredArgsConstructor
public class BancoController {

    private final BancoService service;

    @GetMapping
    public List<BancoEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BancoEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<BancoEntity> guardar(@RequestBody BancoEntity entity) {
        entity.setId(null);
        BancoEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BancoEntity> actualizar(@PathVariable Integer id, @RequestBody BancoEntity entity) {
        return service.buscarPorId(id).map(x -> {
            entity.setId(id);
            return ResponseEntity.ok(service.actualizar(entity));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(x -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
