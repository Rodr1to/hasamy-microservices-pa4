package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Detalle_Reserva;
import com.example.demo.repository.Detalle_ReservaRepository;

import java.util.List;

@RestController
@RequestMapping("/api/finanzas/detalle-reserva")
public class Detalle_ReservaController {

    @Autowired
    private Detalle_ReservaRepository repository;

    @GetMapping
    public List<Detalle_Reserva> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Detalle_Reserva obtenerPorId(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @PostMapping
    public Detalle_Reserva guardar(@RequestBody Detalle_Reserva detalleReserva) {
        return repository.save(detalleReserva);
    }

    @PutMapping("/{id}")
    public Detalle_Reserva actualizar(@PathVariable Integer id, @RequestBody Detalle_Reserva detalleReserva) {
        detalleReserva.setId(id);
        return repository.save(detalleReserva);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}