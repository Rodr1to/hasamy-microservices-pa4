package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.MetodoPagoEntity;
import com.example.demo.service.MetodoPagoService;
import java.util.List;

@RestController
@RequestMapping("/api/catalogo/metodo-pago")
@RequiredArgsConstructor
public class MetodoPagoController {

    private final MetodoPagoService service;

    @GetMapping
    public List<MetodoPagoEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MetodoPagoEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<MetodoPagoEntity> guardar(@RequestBody MetodoPagoEntity entity) {
        entity.setId(null);
        MetodoPagoEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MetodoPagoEntity> actualizar(@PathVariable Integer id, @RequestBody MetodoPagoEntity entity) {
        return service.buscarPorId(id).map(mp -> {
            mp.setNombre(entity.getNombre());
            mp.setEstado(entity.getEstado());
            return ResponseEntity.ok(service.actualizar(mp));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(mp -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}