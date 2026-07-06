package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Reserva;
import com.example.demo.repository.ReservaRepository;

import java.util.List;

@RestController
@RequestMapping("/api/finanzas/reserva")
public class ReservaController {

    @Autowired
    private ReservaRepository repository;

    @GetMapping
    public List<Reserva> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Reserva obtenerPorId(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @PostMapping
    public Reserva guardar(@RequestBody Reserva reserva) {
        return repository.save(reserva);
    }

    @PutMapping("/{id}")
    public Reserva actualizar(@PathVariable Integer id, @RequestBody Reserva reserva) {
        reserva.setId(id);
        return repository.save(reserva);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
