package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.DetalleReserva;
import com.example.demo.service.DetalleReservaService;

import java.util.List;

@RestController
@RequestMapping("/api/finanzas/detalle-reserva")
public class DetalleReservaController {

    @Autowired
    private DetalleReservaService service;

    @GetMapping
    public List<DetalleReserva> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public DetalleReserva obtenerPorId(@PathVariable Integer id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public DetalleReserva guardar(@RequestBody DetalleReserva detalleReserva) {
        return service.guardar(detalleReserva);
    }

    @PutMapping("/{id}")
    public DetalleReserva actualizar(@PathVariable Integer id, @RequestBody DetalleReserva detalleReserva) {
        return service.actualizar(id, detalleReserva);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}