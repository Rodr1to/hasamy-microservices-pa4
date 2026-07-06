package com.example.demo.service;

import com.example.demo.entity.SalonBellezaEntity;
import java.util.List;
import java.util.Optional;

public interface SalonBellezaService {
    List<SalonBellezaEntity> listarTodos();
    Optional<SalonBellezaEntity> buscarPorId(Integer id);
    SalonBellezaEntity guardar(SalonBellezaEntity entity);
    SalonBellezaEntity actualizar(SalonBellezaEntity entity);
    void eliminar(Integer id);
}