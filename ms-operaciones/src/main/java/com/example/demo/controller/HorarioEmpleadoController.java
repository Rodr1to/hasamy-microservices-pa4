package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.HorarioEmpleado;
import com.example.demo.service.HorarioEmpleadoService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/operaciones/horarioempleado")
@RequiredArgsConstructor
public class HorarioEmpleadoController {

    private final HorarioEmpleadoService service;

    @GetMapping
    public List<HorarioEmpleado> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<HorarioEmpleado> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<HorarioEmpleado> guardar(@RequestBody HorarioEmpleado entidad) {
        entidad.setId(null);
        HorarioEmpleado creado = service.guardar(entidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HorarioEmpleado> actualizar(@PathVariable Integer id, @RequestBody HorarioEmpleado entidad) {
        return service.buscarPorId(id).map(he -> {
            he.setEmpleado(entidad.getEmpleado());
            he.setFechaAsignacion(entidad.getFechaAsignacion());
            he.setTurno(entidad.getTurno());
            return ResponseEntity.ok(service.actualizar(he));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(he -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
