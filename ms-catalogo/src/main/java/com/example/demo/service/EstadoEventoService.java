package com.example.demo.service;

import com.example.demo.entity.EstadoEventoEntity;
import java.util.List;
import java.util.Optional;

public interface EstadoEventoService {
    List<EstadoEventoEntity> listarTodos();
    Optional<EstadoEventoEntity> buscarPorId(Integer id);
    EstadoEventoEntity guardar(EstadoEventoEntity entity);
    EstadoEventoEntity actualizar(EstadoEventoEntity entity);
    void eliminar(Integer id);
}
