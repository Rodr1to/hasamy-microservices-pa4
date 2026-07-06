package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.EstadoPagoEntity;
import com.example.demo.service.EstadoPagoService;
import java.util.List;

@RestController
@RequestMapping("/api/catalogo/estado-pago")
@RequiredArgsConstructor
public class EstadoPagoController {

    private final EstadoPagoService service;

    @GetMapping
    public List<EstadoPagoEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstadoPagoEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<EstadoPagoEntity> guardar(@RequestBody EstadoPagoEntity entity) {
        entity.setId(null);
        EstadoPagoEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EstadoPagoEntity> actualizar(@PathVariable Integer id, @RequestBody EstadoPagoEntity entity) {
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
