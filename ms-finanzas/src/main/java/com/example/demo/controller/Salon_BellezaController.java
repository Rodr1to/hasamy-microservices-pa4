package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Salon_Belleza;
import com.example.demo.service.Salon_BellezaService;

import java.util.List;

@RestController
@RequestMapping("/api/finanzas/salon-belleza")
public class Salon_BellezaController {

    @Autowired
    private Salon_BellezaService service;

    @GetMapping
    public List<Salon_Belleza> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Salon_Belleza obtenerPorId(@PathVariable Integer id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public Salon_Belleza guardar(@RequestBody Salon_Belleza salonBelleza) {
        return service.guardar(salonBelleza);
    }

    @PutMapping("/{id}")
    public Salon_Belleza actualizar(@PathVariable Integer id, @RequestBody Salon_Belleza salonBelleza) {
        return service.actualizar(id, salonBelleza);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}