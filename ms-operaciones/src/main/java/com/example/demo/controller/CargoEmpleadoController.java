package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.CargoEmpleado;
import com.example.demo.service.CargoEmpleadoService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/operaciones/cargoempleado")
@RequiredArgsConstructor
public class CargoEmpleadoController {

    private final CargoEmpleadoService service;

    @GetMapping
    public List<CargoEmpleado> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CargoEmpleado> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CargoEmpleado> guardar(@RequestBody CargoEmpleado entidad) {
        entidad.setId(null);
        CargoEmpleado creado = service.guardar(entidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CargoEmpleado> actualizar(@PathVariable Integer id, @RequestBody CargoEmpleado entidad) {
        return service.buscarPorId(id).map(ce -> {
            ce.setNombre(entidad.getNombre());
            ce.setEstado(entidad.getEstado());
            return ResponseEntity.ok(service.actualizar(ce));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(ce -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
