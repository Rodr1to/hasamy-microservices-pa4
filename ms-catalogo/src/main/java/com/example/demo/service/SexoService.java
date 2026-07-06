package com.example.demo.service;

import com.example.demo.entity.SexoEntity;
import java.util.List;
import java.util.Optional;

public interface SexoService {
    List<SexoEntity> listarTodos();
    Optional<SexoEntity> buscarPorId(Integer id);
    SexoEntity guardar(SexoEntity entity);
    SexoEntity actualizar(SexoEntity entity);
    void eliminar(Integer id);
}
