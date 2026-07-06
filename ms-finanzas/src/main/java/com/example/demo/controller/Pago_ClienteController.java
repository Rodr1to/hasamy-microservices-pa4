package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Pago_Cliente;
import com.example.demo.service.Pago_ClienteService;

import java.util.List;

@RestController
@RequestMapping("/api/finanzas/pago-cliente")
public class Pago_ClienteController {

    @Autowired
    private Pago_ClienteService service;

    @GetMapping
    public List<Pago_Cliente> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Pago_Cliente obtenerPorId(@PathVariable Integer id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public Pago_Cliente guardar(@RequestBody Pago_Cliente pagoCliente) {
        return service.guardar(pagoCliente);
    }

    @PutMapping("/{id}")
    public Pago_Cliente actualizar(@PathVariable Integer id, @RequestBody Pago_Cliente pagoCliente) {
        return service.actualizar(id, pagoCliente);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}