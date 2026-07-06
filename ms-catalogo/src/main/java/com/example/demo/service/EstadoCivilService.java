package com.example.demo.service;

import com.example.demo.entity.EstadoCivilEntity;
import java.util.List;
import java.util.Optional;

public interface EstadoCivilService {
    List<EstadoCivilEntity> listarTodos();
    Optional<EstadoCivilEntity> buscarPorId(Integer id);
    EstadoCivilEntity guardar(EstadoCivilEntity entity);
    EstadoCivilEntity actualizar(EstadoCivilEntity entity);
    void eliminar(Integer id);
}
