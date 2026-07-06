package com.example.demo.service;

import com.example.demo.entity.EstadoHotelEntity;
import java.util.List;
import java.util.Optional;

public interface EstadoHotelService {
    List<EstadoHotelEntity> listarTodos();
    Optional<EstadoHotelEntity> buscarPorId(Integer id);
    EstadoHotelEntity guardar(EstadoHotelEntity entity);
    EstadoHotelEntity actualizar(EstadoHotelEntity entity);
    void eliminar(Integer id);
}
