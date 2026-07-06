package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.ComprobantePago;
import com.example.demo.service.ComprobantePagoService;

import java.util.List;

@RestController
@RequestMapping("/api/finanzas/comprobante-pago")
public class ComprobantePagoController {

    @Autowired
    private ComprobantePagoService service;

    @GetMapping
    public List<ComprobantePago> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ComprobantePago obtenerPorId(@PathVariable Integer id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public ComprobantePago guardar(@RequestBody ComprobantePago comprobantePago) {
        return service.guardar(comprobantePago);
    }

    @PutMapping("/{id}")
    public ComprobantePago actualizar(@PathVariable Integer id, @RequestBody ComprobantePago comprobantePago) {
        return service.actualizar(id, comprobantePago);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}