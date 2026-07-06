package com.example.demo.service;

import com.example.demo.entity.MetodoPagoEntity;
import java.util.List;
import java.util.Optional;

public interface MetodoPagoService {
    List<MetodoPagoEntity> listarTodos();
    Optional<MetodoPagoEntity> buscarPorId(Integer id);
    MetodoPagoEntity guardar(MetodoPagoEntity entity);
    MetodoPagoEntity actualizar(MetodoPagoEntity entity);
    void eliminar(Integer id);
}