package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.VueloPonente;
import com.example.demo.service.VueloPonenteService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/operaciones/vueloponente")
@RequiredArgsConstructor
public class VueloPonenteController {

    private final VueloPonenteService service;

    @GetMapping
    public List<VueloPonente> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<VueloPonente> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<VueloPonente> guardar(@RequestBody VueloPonente entidad) {
        entidad.setId(null);
        VueloPonente creado = service.guardar(entidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VueloPonente> actualizar(@PathVariable Integer id, @RequestBody VueloPonente entidad) {
        return service.buscarPorId(id).map(vp -> {
            vp.setEstadoVuelo(entidad.getEstadoVuelo());
            vp.setAerolinea(entidad.getAerolinea());
            vp.setEvento(entidad.getEvento());
            vp.setPonente(entidad.getPonente());
            vp.setNumeroVuelo(entidad.getNumeroVuelo());
            vp.setFechaLlegada(entidad.getFechaLlegada());
            return ResponseEntity.ok(service.actualizar(vp));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(vp -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
