package com.example.demo.service;

import com.example.demo.entity.Detalle_Reserva;
import com.example.demo.repository.Detalle_ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Detalle_ReservaService {

    @Autowired
    private Detalle_ReservaRepository repository;

    public List<Detalle_Reserva> listarTodos() {
        return repository.findAll();
    }

    public Detalle_Reserva obtenerPorId(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    public Detalle_Reserva guardar(Detalle_Reserva detalleReserva) {
        return repository.save(detalleReserva);
    }

    public Detalle_Reserva actualizar(Integer id, Detalle_Reserva detalleReserva) {
        detalleReserva.setId(id);
        return repository.save(detalleReserva);
    }

    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}