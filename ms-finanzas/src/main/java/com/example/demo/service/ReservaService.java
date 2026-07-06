package com.example.demo.service;

import com.example.demo.entity.Reserva;
import com.example.demo.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository repository;

    public List<Reserva> listarTodos() {
        return repository.findAll();
    }

    public Reserva obtenerPorId(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    public Reserva guardar(Reserva reserva) {
        return repository.save(reserva);
    }

    public Reserva actualizar(Integer id, Reserva reserva) {
        reserva.setId(id);
        return repository.save(reserva);
    }

    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}