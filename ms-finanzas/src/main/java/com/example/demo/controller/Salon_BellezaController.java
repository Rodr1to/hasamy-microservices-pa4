package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Salon_Belleza;
import com.example.demo.repository.Salon_BellezaRepository;

import java.util.List;

@RestController
@RequestMapping("/api/finanzas/salon-belleza")
public class Salon_BellezaController {

    @Autowired
    private Salon_BellezaRepository repository;

    @GetMapping
    public List<Salon_Belleza> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Salon_Belleza obtenerPorId(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @PostMapping
    public Salon_Belleza guardar(@RequestBody Salon_Belleza salonBelleza) {
        return repository.save(salonBelleza);
    }

    @PutMapping("/{id}")
    public Salon_Belleza actualizar(@PathVariable Integer id, @RequestBody Salon_Belleza salonBelleza) {
        salonBelleza.setId(id);
        return repository.save(salonBelleza);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}