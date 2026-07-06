package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Comprobante_Pago;
import com.example.demo.repository.Comprobante_PagoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/finanzas/comprobante-pago")
public class Comprobante_PagoController {

    @Autowired
    private Comprobante_PagoRepository repository;

    @GetMapping
    public List<Comprobante_Pago> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Comprobante_Pago obtenerPorId(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @PostMapping
    public Comprobante_Pago guardar(@RequestBody Comprobante_Pago comprobantePago) {
        return repository.save(comprobantePago);
    }

    @PutMapping("/{id}")
    public Comprobante_Pago actualizar(@PathVariable Integer id, @RequestBody Comprobante_Pago comprobantePago) {
        comprobantePago.setId(id);
        return repository.save(comprobantePago);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}