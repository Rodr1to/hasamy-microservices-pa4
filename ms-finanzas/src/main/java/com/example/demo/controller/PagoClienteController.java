package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.PagoClienteEntity;
import com.example.demo.service.PagoClienteService;
import java.util.List;

@RestController
@RequestMapping("/api/finanzas/pagocliente")
@RequiredArgsConstructor
public class PagoClienteController {

    private final PagoClienteService service;

    @GetMapping
    public List<PagoClienteEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PagoClienteEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PagoClienteEntity> guardar(@RequestBody PagoClienteEntity entity) {
        entity.setId(null);
        PagoClienteEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PagoClienteEntity> actualizar(@PathVariable Integer id, @RequestBody PagoClienteEntity entity) {
        return service.buscarPorId(id).map(pc -> {
            pc.setMontoPago(entity.getMontoPago());
            pc.setNumOperacion(entity.getNumOperacion());
            pc.setComprobante(entity.getComprobante());
            pc.setMetodoPago(entity.getMetodoPago());
            pc.setEstadoPago(entity.getEstadoPago());
            pc.setBanco(entity.getBanco());
            return ResponseEntity.ok(service.actualizar(pc));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(pc -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
