package com.example.demo.service;

import com.example.demo.entity.SalonBelleza;

import java.util.List;

public interface SalonBellezaService {

    List<SalonBelleza> listarTodos();

    SalonBelleza obtenerPorId(Integer id);

    SalonBelleza guardar(SalonBelleza salonBelleza);

    SalonBelleza actualizar(Integer id, SalonBelleza salonBelleza);

    void eliminar(Integer id);
}