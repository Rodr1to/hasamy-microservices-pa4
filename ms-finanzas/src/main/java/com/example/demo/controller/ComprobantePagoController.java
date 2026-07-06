package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.ComprobantePagoEntity;
import com.example.demo.service.ComprobantePagoService;
import java.util.List;

@RestController
@RequestMapping("/api/finanzas/comprobantepago")
@RequiredArgsConstructor
public class ComprobantePagoController {

    private final ComprobantePagoService service;

    @GetMapping
    public List<ComprobantePagoEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ComprobantePagoEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ComprobantePagoEntity> guardar(@RequestBody ComprobantePagoEntity entity) {
        entity.setId(null);
        ComprobantePagoEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ComprobantePagoEntity> actualizar(@PathVariable Integer id, @RequestBody ComprobantePagoEntity entity) {
        return service.buscarPorId(id).map(cp -> {
            cp.setNroComprobante(entity.getNroComprobante());
            cp.setTotalComprobante(entity.getTotalComprobante());
            cp.setReserva(entity.getReserva());
            cp.setTipoComprobante(entity.getTipoComprobante());
            return ResponseEntity.ok(service.actualizar(cp));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(cp -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
