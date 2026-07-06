package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.TipoComprobanteEntity;
import com.example.demo.service.TipoComprobanteService;
import java.util.List;

@RestController
@RequestMapping("/api/catalogo/tipo-comprobante")
@RequiredArgsConstructor
public class TipoComprobanteController {

    private final TipoComprobanteService service;

    @GetMapping
    public List<TipoComprobanteEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoComprobanteEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<TipoComprobanteEntity> guardar(@RequestBody TipoComprobanteEntity entity) {
        entity.setId(null);
        TipoComprobanteEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoComprobanteEntity> actualizar(@PathVariable Integer id, @RequestBody TipoComprobanteEntity entity) {
        return service.buscarPorId(id).map(tc -> {
            tc.setNombre(entity.getNombre());
            tc.setEstado(entity.getEstado());
            return ResponseEntity.ok(service.actualizar(tc));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(tc -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
