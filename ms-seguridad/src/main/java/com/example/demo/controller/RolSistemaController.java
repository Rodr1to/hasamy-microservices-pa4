package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.RolSistema;
import com.example.demo.service.RolSistemaService;
import java.util.List;

@RestController
@RequestMapping("/api/seguridad/rolsistema")
@RequiredArgsConstructor
public class RolSistemaController {

    private final RolSistemaService service;

    @GetMapping
    public List<RolSistema> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RolSistema> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<RolSistema> guardar(@RequestBody RolSistema rolSistema) {
        rolSistema.setId(null);
        RolSistema creado = service.guardar(rolSistema);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RolSistema> actualizar(@PathVariable Integer id, @RequestBody RolSistema rolSistema) {
        return service.buscarPorId(id).map(rs -> {
            rs.setNombre(rolSistema.getNombre());
            rs.setEstado(rolSistema.getEstado());
            return ResponseEntity.ok(service.actualizar(rs));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(rs -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}