package com.example.demo.service;

import com.example.demo.entity.DetalleReserva;

import java.util.List;

public interface DetalleReservaService {

    List<DetalleReserva> listarTodos();

    DetalleReserva obtenerPorId(Integer id);

    DetalleReserva guardar(DetalleReserva detalleReserva);

    DetalleReserva actualizar(Integer id, DetalleReserva detalleReserva);

    void eliminar(Integer id);
}