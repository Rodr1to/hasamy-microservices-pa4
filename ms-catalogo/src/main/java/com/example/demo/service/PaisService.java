package com.example.demo.service;

import com.example.demo.entity.PaisEntity;
import java.util.List;
import java.util.Optional;

public interface PaisService {
    List<PaisEntity> listarTodos();
    Optional<PaisEntity> buscarPorId(Integer id);
    PaisEntity guardar(PaisEntity entity);
    PaisEntity actualizar(PaisEntity entity);
    void eliminar(Integer id);
}
