package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.KitLogistico;
import com.example.demo.service.KitLogisticoService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/operaciones/kitlogistico")
@RequiredArgsConstructor
public class KitLogisticoController {

    private final KitLogisticoService service;

    @GetMapping
    public List<KitLogistico> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<KitLogistico> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<KitLogistico> guardar(@RequestBody KitLogistico entidad) {
        entidad.setId(null);
        KitLogistico creado = service.guardar(entidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<KitLogistico> actualizar(@PathVariable Integer id, @RequestBody KitLogistico entidad) {
        return service.buscarPorId(id).map(kt -> {
            kt.setContenido(entidad.getContenido());
            kt.setEntregado(entidad.getEntregado());
            kt.setTicket(entidad.getTicket());
            return ResponseEntity.ok(service.actualizar(kt));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(kt -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
