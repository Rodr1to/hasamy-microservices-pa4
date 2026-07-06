package com.example.demo.service;

import com.example.demo.entity.Reserva;

import java.util.List;

public interface ReservaService {

    List<Reserva> listarTodos();

    Reserva obtenerPorId(Integer id);

    Reserva guardar(Reserva reserva);

    Reserva actualizar(Integer id, Reserva reserva);

    void eliminar(Integer id);
}