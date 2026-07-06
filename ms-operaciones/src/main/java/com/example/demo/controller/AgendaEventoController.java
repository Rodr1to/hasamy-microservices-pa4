package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.AgendaEvento;
import com.example.demo.service.AgendaEventoService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/operaciones/agendaevento")
@RequiredArgsConstructor
public class AgendaEventoController {

    private final AgendaEventoService service;

    @GetMapping
    public List<AgendaEvento> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AgendaEvento> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<AgendaEvento> guardar(@RequestBody AgendaEvento entidad) {
        entidad.setId(null);
        AgendaEvento creado = service.guardar(entidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AgendaEvento> actualizar(@PathVariable Integer id, @RequestBody AgendaEvento entidad) {
        return service.buscarPorId(id).map(ae -> {
            ae.setEvento(entidad.getEvento());
            ae.setTema(entidad.getTema());
            ae.setHoraFin(entidad.getHoraFin());
            ae.setHoraInicio(entidad.getHoraInicio());
            ae.setPonente(entidad.getPonente());
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
