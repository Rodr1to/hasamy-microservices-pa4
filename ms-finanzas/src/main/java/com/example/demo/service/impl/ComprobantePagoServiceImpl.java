package com.example.demo.service.impl;

import com.example.demo.entity.ComprobantePago;
import com.example.demo.repository.ComprobantePagoRepository;
import com.example.demo.service.ComprobantePagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComprobantePagoServiceImpl implements ComprobantePagoService {

    @Autowired
    private ComprobantePagoRepository repository;

    @Override
    public List<ComprobantePago> listarTodos() {
        return repository.findAll();
    }

    @Override
    public ComprobantePago obtenerPorId(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public ComprobantePago guardar(ComprobantePago comprobantePago) {
        return repository.save(comprobantePago);
    }

    @Override
    public ComprobantePago actualizar(Integer id, ComprobantePago comprobantePago) {
        comprobantePago.setId(id);
        return repository.save(comprobantePago);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}