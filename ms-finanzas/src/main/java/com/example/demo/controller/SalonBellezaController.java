package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.SalonBellezaEntity;
import com.example.demo.service.SalonBellezaService;
import java.util.List;

@RestController
@RequestMapping("/api/finanzas/salonbelleza")
@RequiredArgsConstructor
public class SalonBellezaController {

    private final SalonBellezaService service;

    @GetMapping
    public List<SalonBellezaEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SalonBellezaEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<SalonBellezaEntity> guardar(@RequestBody SalonBellezaEntity entity) {
        entity.setId(null);
        SalonBellezaEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SalonBellezaEntity> actualizar(@PathVariable Integer id, @RequestBody SalonBellezaEntity entity) {
        return service.buscarPorId(id).map(sb -> {
            sb.setRuc(entity.getRuc());
            sb.setNombre(entity.getNombre());
            sb.setDireccion(entity.getDireccion());
            sb.setDistrito(entity.getDistrito());
            sb.setEstado(entity.getEstado());
            return ResponseEntity.ok(service.actualizar(sb));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(sb -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}