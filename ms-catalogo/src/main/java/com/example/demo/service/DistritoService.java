package com.example.demo.service;

import com.example.demo.entity.DistritoEntity;
import java.util.List;
import java.util.Optional;

public interface DistritoService {
    List<DistritoEntity> listarTodos();
    Optional<DistritoEntity> buscarPorId(Integer id);
    DistritoEntity guardar(DistritoEntity entity);
    DistritoEntity actualizar(DistritoEntity entity);
    void eliminar(Integer id);
}