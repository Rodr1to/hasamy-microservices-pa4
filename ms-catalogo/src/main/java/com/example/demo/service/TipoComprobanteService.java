package com.example.demo.service;

import com.example.demo.entity.TipoComprobanteEntity;
import java.util.List;
import java.util.Optional;

public interface TipoComprobanteService {
    List<TipoComprobanteEntity> listarTodos();
    Optional<TipoComprobanteEntity> buscarPorId(Integer id);
    TipoComprobanteEntity guardar(TipoComprobanteEntity entity);
    TipoComprobanteEntity actualizar(TipoComprobanteEntity entity);
    void eliminar(Integer id);
}
