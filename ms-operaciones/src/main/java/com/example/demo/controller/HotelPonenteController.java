package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.HotelPonente;
import com.example.demo.service.HotelPonenteService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/operaciones/hotelponente")
@RequiredArgsConstructor
public class HotelPonenteController {

    private final HotelPonenteService service;

    @GetMapping
    public List<HotelPonente> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<HotelPonente> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<HotelPonente> guardar(@RequestBody HotelPonente entidad) {
        entidad.setId(null);
        HotelPonente creado = service.guardar(entidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HotelPonente> actualizar(@PathVariable Integer id, @RequestBody HotelPonente entidad) {
        return service.buscarPorId(id).map(hp -> {
            hp.setEstadoHotel(entidad.getEstadoHotel());
            hp.setEvento(entidad.getEvento());
            hp.setPonente(entidad.getPonente());
            hp.setNombreHotel(entidad.getNombreHotel());
            hp.setFechaCheckout(entidad.getFechaCheckout());
            hp.setFechaCheckin(entidad.getFechaCheckin());
            return ResponseEntity.ok(service.actualizar(hp));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(hp -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
