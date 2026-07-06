package com.example.demo.service;

import com.example.demo.entity.CategoriaZonaEntity;
import java.util.List;
import java.util.Optional;

public interface CategoriaZonaService {
    List<CategoriaZonaEntity> listarTodos();
    Optional<CategoriaZonaEntity> buscarPorId(Integer id);
    CategoriaZonaEntity guardar(CategoriaZonaEntity entity);
    CategoriaZonaEntity actualizar(CategoriaZonaEntity entity);
    void eliminar(Integer id);
}