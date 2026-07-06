package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.TicketIngreso;
import com.example.demo.service.TicketIngresoService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/operaciones/ticketingreso")
@RequiredArgsConstructor
public class TicketIngresoController {

    private final TicketIngresoService service;

    @GetMapping
    public List<TicketIngreso> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TicketIngreso> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<TicketIngreso> guardar(@RequestBody TicketIngreso entidad) {
        entidad.setId(null);
        TicketIngreso creado = service.guardar(entidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TicketIngreso> actualizar(@PathVariable Integer id, @RequestBody TicketIngreso entidad) {
        return service.buscarPorId(id).map(ti -> {
            ti.setCliente(entidad.getCliente());
            ti.setCodigoQr(entidad.getCodigoQr());
            ti.setEstado(entidad.getEstado());
            ti.setDetalleReserva(entidad.getDetalleReserva());
            return ResponseEntity.ok(service.actualizar(ti));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(ti -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
