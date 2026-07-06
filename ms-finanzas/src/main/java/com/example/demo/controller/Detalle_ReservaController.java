package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Detalle_Reserva;
import com.example.demo.service.Detalle_ReservaService;

import java.util.List;

@RestController
@RequestMapping("/api/finanzas/detalle-reserva")
public class Detalle_ReservaController {

    @Autowired
    private Detalle_ReservaService service;

    @GetMapping
    public List<Detalle_Reserva> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Detalle_Reserva obtenerPorId(@PathVariable Integer id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public Detalle_Reserva guardar(@RequestBody Detalle_Reserva detalleReserva) {
        return service.guardar(detalleReserva);
    }

    @PutMapping("/{id}")
    public Detalle_Reserva actualizar(@PathVariable Integer id, @RequestBody Detalle_Reserva detalleReserva) {
        return service.actualizar(id, detalleReserva);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}