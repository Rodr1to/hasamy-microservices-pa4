package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.TurnoLaboral;
import com.example.demo.service.TurnoLaboralService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/operaciones/turnolaboral")
@RequiredArgsConstructor
public class TurnoLaboralController {

    private final TurnoLaboralService service;

    @GetMapping
    public List<TurnoLaboral> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TurnoLaboral> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<TurnoLaboral> guardar(@RequestBody TurnoLaboral entidad) {
        entidad.setId(null);
        TurnoLaboral creado = service.guardar(entidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TurnoLaboral> actualizar(@PathVariable Integer id, @RequestBody TurnoLaboral entidad) {
        return service.buscarPorId(id).map(tl -> {
            tl.setEstado(entidad.getEstado());
            tl.setHoraFin(entidad.getHoraFin());
            tl.setHoraInicio(entidad.getHoraInicio());
            tl.setNombre(entidad.getNombre());
            return ResponseEntity.ok(service.actualizar(tl));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(tl -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
