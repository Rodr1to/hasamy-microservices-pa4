package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.SalonBelleza;
import com.example.demo.service.SalonBellezaService;

import java.util.List;

@RestController
@RequestMapping("/api/finanzas/salon-belleza")
public class SalonBellezaController {

    @Autowired
    private SalonBellezaService service;

    @GetMapping
    public List<SalonBelleza> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public SalonBelleza obtenerPorId(@PathVariable Integer id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public SalonBelleza guardar(@RequestBody SalonBelleza salonBelleza) {
        return service.guardar(salonBelleza);
    }

    @PutMapping("/{id}")
    public SalonBelleza actualizar(@PathVariable Integer id, @RequestBody SalonBelleza salonBelleza) {
        return service.actualizar(id, salonBelleza);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}