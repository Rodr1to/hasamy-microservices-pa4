package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.AsistenciaEmpleado;
import com.example.demo.service.AsistenciaEmpleadoService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/operaciones/asistenciaempleado")
@RequiredArgsConstructor
public class AsistenciaEmpleadoController {

    private final AsistenciaEmpleadoService service;

    @GetMapping
    public List<AsistenciaEmpleado> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AsistenciaEmpleado> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<AsistenciaEmpleado> guardar(@RequestBody AsistenciaEmpleado entidad) {
        entidad.setId(null);
        AsistenciaEmpleado creado = service.guardar(entidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AsistenciaEmpleado> actualizar(@PathVariable Integer id, @RequestBody AsistenciaEmpleado entidad) {
        return service.buscarPorId(id).map(ae -> {
            ae.setEmpleado(entidad.getEmpleado());
            ae.setFecha(entidad.getFecha());
            ae.setHoraIngreso(entidad.getHoraIngreso());
            ae.setHoraSalida(entidad.getHoraSalida());
            return ResponseEntity.ok(service.actualizar(ae));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(ae -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
