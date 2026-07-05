package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.MetodoPago;
import com.example.demo.repository.MetodoPagoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/catalogo/metodopago")
public class MetodoPagoController {

    @Autowired
    private MetodoPagoRepository repository;

    @GetMapping
    public List<MetodoPago> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public MetodoPago obtenerPorId(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public MetodoPago guardar(@RequestBody MetodoPago metodoPago) {
        return repository.save(metodoPago);
    }

    @PutMapping("/{id}")
    public MetodoPago actualizar(@PathVariable Integer id, @RequestBody MetodoPago metodoPago) {
        metodoPago.setId(id);
        return repository.save(metodoPago);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}