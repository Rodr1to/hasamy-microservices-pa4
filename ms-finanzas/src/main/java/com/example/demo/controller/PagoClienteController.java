package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.PagoCliente;
import com.example.demo.service.PagoClienteService;

import java.util.List;

@RestController
@RequestMapping("/api/finanzas/pago-cliente")
public class PagoClienteController {

    @Autowired
    private PagoClienteService service;

    @GetMapping
    public List<PagoCliente> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public PagoCliente obtenerPorId(@PathVariable Integer id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public PagoCliente guardar(@RequestBody PagoCliente pagoCliente) {
        return service.guardar(pagoCliente);
    }

    @PutMapping("/{id}")
    public PagoCliente actualizar(@PathVariable Integer id, @RequestBody PagoCliente pagoCliente) {
        return service.actualizar(id, pagoCliente);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}