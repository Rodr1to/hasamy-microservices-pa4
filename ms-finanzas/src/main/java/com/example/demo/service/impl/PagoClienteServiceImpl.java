package com.example.demo.service.impl;

import com.example.demo.entity.PagoCliente;
import com.example.demo.repository.PagoClienteRepository;
import com.example.demo.service.PagoClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoClienteServiceImpl implements PagoClienteService {

    @Autowired
    private PagoClienteRepository repository;

    @Override
    public List<PagoCliente> listarTodos() {
        return repository.findAll();
    }

    @Override
    public PagoCliente obtenerPorId(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public PagoCliente guardar(PagoCliente pagoCliente) {
        return repository.save(pagoCliente);
    }

    @Override
    public PagoCliente actualizar(Integer id, PagoCliente pagoCliente) {
        pagoCliente.setId(id);
        return repository.save(pagoCliente);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}