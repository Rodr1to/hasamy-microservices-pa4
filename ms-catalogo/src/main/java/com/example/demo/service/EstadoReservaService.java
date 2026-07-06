package com.example.demo.service;

import com.example.demo.entity.EstadoReservaEntity;
import java.util.List;
import java.util.Optional;

public interface EstadoReservaService {
    List<EstadoReservaEntity> listarTodos();
    Optional<EstadoReservaEntity> buscarPorId(Integer id);
    EstadoReservaEntity guardar(EstadoReservaEntity entity);
    EstadoReservaEntity actualizar(EstadoReservaEntity entity);
    void eliminar(Integer id);
}
