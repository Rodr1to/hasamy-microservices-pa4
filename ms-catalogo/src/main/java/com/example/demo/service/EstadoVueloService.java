package com.example.demo.service;

import com.example.demo.entity.EstadoVueloEntity;
import java.util.List;
import java.util.Optional;

public interface EstadoVueloService {
    List<EstadoVueloEntity> listarTodos();
    Optional<EstadoVueloEntity> buscarPorId(Integer id);
    EstadoVueloEntity guardar(EstadoVueloEntity entity);
    EstadoVueloEntity actualizar(EstadoVueloEntity entity);
    void eliminar(Integer id);
}
