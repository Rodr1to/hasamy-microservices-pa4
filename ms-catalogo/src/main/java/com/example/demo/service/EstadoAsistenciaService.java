package com.example.demo.service;

import com.example.demo.entity.EstadoAsistenciaEntity;
import java.util.List;
import java.util.Optional;

public interface EstadoAsistenciaService {
    List<EstadoAsistenciaEntity> listarTodos();
    Optional<EstadoAsistenciaEntity> buscarPorId(Integer id);
    EstadoAsistenciaEntity guardar(EstadoAsistenciaEntity entity);
    EstadoAsistenciaEntity actualizar(EstadoAsistenciaEntity entity);
    void eliminar(Integer id);
}