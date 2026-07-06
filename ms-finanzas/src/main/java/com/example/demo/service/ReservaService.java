package com.example.demo.service;

import com.example.demo.entity.ReservaEntity;
import java.util.List;
import java.util.Optional;

public interface ReservaService {
    List<ReservaEntity> listarTodos();
    Optional<ReservaEntity> buscarPorId(Integer id);
    ReservaEntity guardar(ReservaEntity entity);
    ReservaEntity actualizar(ReservaEntity entity);
    void eliminar(Integer id);
}
