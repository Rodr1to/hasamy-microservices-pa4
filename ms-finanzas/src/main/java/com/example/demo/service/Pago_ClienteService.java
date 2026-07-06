package com.example.demo.service;

import com.example.demo.entity.Pago_Cliente;
import com.example.demo.repository.Pago_ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Pago_ClienteService {

    @Autowired
    private Pago_ClienteRepository repository;

    public List<Pago_Cliente> listarTodos() {
        return repository.findAll();
    }

    public Pago_Cliente obtenerPorId(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    public Pago_Cliente guardar(Pago_Cliente pagoCliente) {
        return repository.save(pagoCliente);
    }

    public Pago_Cliente actualizar(Integer id, Pago_Cliente pagoCliente) {
        pagoCliente.setId(id);
        return repository.save(pagoCliente);
    }

    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}