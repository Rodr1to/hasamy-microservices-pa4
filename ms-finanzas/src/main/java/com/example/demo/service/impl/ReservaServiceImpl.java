package com.example.demo.service.impl;

import com.example.demo.entity.Reserva;
import com.example.demo.repository.ReservaRepository;
import com.example.demo.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository repository;

    @Override
    public List<Reserva> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Reserva obtenerPorId(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Reserva guardar(Reserva reserva) {
        return repository.save(reserva);
    }

    @Override
    public Reserva actualizar(Integer id, Reserva reserva) {
        reserva.setId(id);
        return repository.save(reserva);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}