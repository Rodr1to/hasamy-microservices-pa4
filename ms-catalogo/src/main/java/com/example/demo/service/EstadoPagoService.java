package com.example.demo.service;

import com.example.demo.entity.EstadoPagoEntity;
import java.util.List;
import java.util.Optional;

public interface EstadoPagoService {
    List<EstadoPagoEntity> listarTodos();
    Optional<EstadoPagoEntity> buscarPorId(Integer id);
    EstadoPagoEntity guardar(EstadoPagoEntity entity);
    EstadoPagoEntity actualizar(EstadoPagoEntity entity);
    void eliminar(Integer id);
}
