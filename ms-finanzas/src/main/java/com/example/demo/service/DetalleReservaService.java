package com.example.demo.service;

import com.example.demo.entity.DetalleReservaEntity;
import java.util.List;
import java.util.Optional;

public interface DetalleReservaService {
    List<DetalleReservaEntity> listarTodos();
    Optional<DetalleReservaEntity> buscarPorId(Integer id);
    DetalleReservaEntity guardar(DetalleReservaEntity entity);
    DetalleReservaEntity actualizar(DetalleReservaEntity entity);
    void eliminar(Integer id);
}