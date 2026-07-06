package com.example.demo.service;

import com.example.demo.entity.PagoCliente;

import java.util.List;

public interface PagoClienteService {

    List<PagoCliente> listarTodos();

    PagoCliente obtenerPorId(Integer id);

    PagoCliente guardar(PagoCliente pagoCliente);

    PagoCliente actualizar(Integer id, PagoCliente pagoCliente);

    void eliminar(Integer id);
}