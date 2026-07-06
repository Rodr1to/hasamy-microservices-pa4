package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Reserva;
import com.example.demo.service.ReservaService;

import java.util.List;

@RestController
@RequestMapping("/api/finanzas/reserva")
public class ReservaController {

    @Autowired
    private ReservaService service;

    @GetMapping
    public List<Reserva> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Reserva obtenerPorId(@PathVariable Integer id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public Reserva guardar(@RequestBody Reserva reserva) {
        return service.guardar(reserva);
    }

    @PutMapping("/{id}")
    public Reserva actualizar(@PathVariable Integer id, @RequestBody Reserva reserva) {
        return service.actualizar(id, reserva);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}