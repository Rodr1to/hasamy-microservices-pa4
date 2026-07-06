package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Comprobante_Pago;
import com.example.demo.service.Comprobante_PagoService;

import java.util.List;

@RestController
@RequestMapping("/api/finanzas/comprobante-pago")
public class Comprobante_PagoController {

    @Autowired
    private Comprobante_PagoService service;

    @GetMapping
    public List<Comprobante_Pago> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Comprobante_Pago obtenerPorId(@PathVariable Integer id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public Comprobante_Pago guardar(@RequestBody Comprobante_Pago comprobantePago) {
        return service.guardar(comprobantePago);
    }

    @PutMapping("/{id}")
    public Comprobante_Pago actualizar(@PathVariable Integer id, @RequestBody Comprobante_Pago comprobantePago) {
        return service.actualizar(id, comprobantePago);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}