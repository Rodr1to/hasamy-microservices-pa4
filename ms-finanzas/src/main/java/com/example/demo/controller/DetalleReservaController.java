package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.DetalleReservaEntity;
import com.example.demo.service.DetalleReservaService;
import java.util.List;

@RestController
@RequestMapping("/api/finanzas/detallereserva")
@RequiredArgsConstructor
public class DetalleReservaController {

    private final DetalleReservaService service;

    @GetMapping
    public List<DetalleReservaEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleReservaEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<DetalleReservaEntity> guardar(@RequestBody DetalleReservaEntity entity) {
        entity.setId(null);
        DetalleReservaEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetalleReservaEntity> actualizar(@PathVariable Integer id, @RequestBody DetalleReservaEntity entity) {
        return service.buscarPorId(id).map(dr -> {
            dr.setCantidadTickets(entity.getCantidadTickets());
            dr.setSubtotal(entity.getSubtotal());
            dr.setReserva(entity.getReserva());
            dr.setZona(entity.getZona());
            return ResponseEntity.ok(service.actualizar(dr));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(dr -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}