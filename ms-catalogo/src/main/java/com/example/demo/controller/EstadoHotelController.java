package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.EstadoHotelEntity;
import com.example.demo.service.EstadoHotelService;
import java.util.List;

@RestController
@RequestMapping("/api/catalogo/estadohotel")
@RequiredArgsConstructor
public class EstadoHotelController {

    private final EstadoHotelService service;

    @GetMapping
    public List<EstadoHotelEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstadoHotelEntity> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<EstadoHotelEntity> guardar(@RequestBody EstadoHotelEntity entity) {
        entity.setId(null);
        EstadoHotelEntity creado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EstadoHotelEntity> actualizar(@PathVariable Integer id, @RequestBody EstadoHotelEntity entity) {
        return service.buscarPorId(id).map(eh -> {
            eh.setNombre(entity.getNombre());
            eh.setEstado(entity.getEstado());
            return ResponseEntity.ok(service.actualizar(eh));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(eh -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
