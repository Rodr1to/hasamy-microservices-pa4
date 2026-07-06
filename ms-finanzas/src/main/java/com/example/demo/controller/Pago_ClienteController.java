package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Pago_Cliente;
import com.example.demo.repository.Pago_ClienteRepository;

import java.util.List;

@RestController
@RequestMapping("/api/finanzas/pago-cliente")
public class Pago_ClienteController {

    @Autowired
    private Pago_ClienteRepository repository;

    @GetMapping
    public List<Pago_Cliente> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Pago_Cliente obtenerPorId(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @PostMapping
    public Pago_Cliente guardar(@RequestBody Pago_Cliente pagoCliente) {
        return repository.save(pagoCliente);
    }

    @PutMapping("/{id}")
    public Pago_Cliente actualizar(@PathVariable Integer id, @RequestBody Pago_Cliente pagoCliente) {
        pagoCliente.setId(id);
        return repository.save(pagoCliente);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}