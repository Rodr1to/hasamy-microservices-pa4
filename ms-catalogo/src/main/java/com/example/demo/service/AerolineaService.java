package com.example.demo.service;

import com.example.demo.entity.AerolineaEntity;
import java.util.List;
import java.util.Optional;

public interface AerolineaService {
    List<AerolineaEntity> listarTodos();
    Optional<AerolineaEntity> buscarPorId(Integer id);
    AerolineaEntity guardar(AerolineaEntity entity);
    AerolineaEntity actualizar(AerolineaEntity entity);
    void eliminar(Integer id);
}