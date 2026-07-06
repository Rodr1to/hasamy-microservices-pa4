package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.ControlPuerta;
import com.example.demo.service.ControlPuertaService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/operaciones/controlpuerta")
@RequiredArgsConstructor
public class ControlPuertaController {

    private final ControlPuertaService service;

    @GetMapping
    public List<ControlPuerta> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ControlPuerta> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ControlPuerta> guardar(@RequestBody ControlPuerta entidad) {
        entidad.setId(null);
        ControlPuerta creado = service.guardar(entidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ControlPuerta> actualizar(@PathVariable Integer id, @RequestBody ControlPuerta entidad) {
        return service.buscarPorId(id).map(cp -> {
            cp.setEmpleado( entidad.getEmpleado());
            cp.setFechaEscaneo( entidad.getFechaEscaneo());
            cp.setEstadoAsistencia( entidad.getEstadoAsistencia());
            cp.setTicket( entidad.getTicket());
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
