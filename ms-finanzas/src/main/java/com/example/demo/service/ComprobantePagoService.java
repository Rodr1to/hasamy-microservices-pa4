package com.example.demo.service;

import com.example.demo.entity.ComprobantePago;

import java.util.List;

public interface ComprobantePagoService {

    List<ComprobantePago> listarTodos();

    ComprobantePago obtenerPorId(Integer id);

    ComprobantePago guardar(ComprobantePago comprobantePago);

    ComprobantePago actualizar(Integer id, ComprobantePago comprobantePago);

    void eliminar(Integer id);
}