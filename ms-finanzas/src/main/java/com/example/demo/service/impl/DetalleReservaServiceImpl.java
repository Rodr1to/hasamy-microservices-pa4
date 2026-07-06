package com.example.demo.service.impl;

import com.example.demo.entity.DetalleReserva;
import com.example.demo.repository.DetalleReservaRepository;
import com.example.demo.service.DetalleReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleReservaServiceImpl implements DetalleReservaService {

    @Autowired
    private DetalleReservaRepository repository;

    @Override
    public List<DetalleReserva> listarTodos() {
        return repository.findAll();
    }

    @Override
    public DetalleReserva obtenerPorId(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public DetalleReserva guardar(DetalleReserva detalleReserva) {
        return repository.save(detalleReserva);
    }

    @Override
    public DetalleReserva actualizar(Integer id, DetalleReserva detalleReserva) {
        detalleReserva.setId(id);
        return repository.save(detalleReserva);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}