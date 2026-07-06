package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.ReservaEntity;
import com.example.demo.service.ReservaService;
import java.util.List;

@RestController
@RequestMapping("/api/finanzas/reserva")
@RequiredArgsConstructor
public class ReservaController {

    private final ReservaService service;

    @GetMapping
    public List<ReservaEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservaEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ReservaEntity> guardar(@RequestBody ReservaEntity entity) {
        entity.setId(null);
        ReservaEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReservaEntity> actualizar(@PathVariable Integer id, @RequestBody ReservaEntity entity) {
        return service.buscarPorId(id).map(r -> {
            r.setTotal(entity.getTotal());
            r.setCliente(entity.getCliente());
            r.setEmpleado(entity.getEmpleado());
            r.setEstadoReserva(entity.getEstadoReserva());
            return ResponseEntity.ok(service.actualizar(r));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(r -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
