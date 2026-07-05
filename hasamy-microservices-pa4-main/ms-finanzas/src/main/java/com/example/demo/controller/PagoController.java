package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Pago;
import com.example.demo.repository.PagoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/finanzas/pago")
public class PagoController {

    @Autowired
    private PagoRepository repository;

    @GetMapping
    public List<Pago> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Pago obtenerPorId(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public Pago guardar(@RequestBody Pago pago) {
        return repository.save(pago);
    }

    @PutMapping("/{id}")
    public Pago actualizar(@PathVariable Integer id, @RequestBody Pago pago) {
        pago.setId(id);
        return repository.save(pago);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}