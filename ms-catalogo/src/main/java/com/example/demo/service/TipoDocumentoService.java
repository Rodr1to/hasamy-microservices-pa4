package com.example.demo.service;

import com.example.demo.entity.TipoDocumentoEntity;
import java.util.List;
import java.util.Optional;

public interface TipoDocumentoService {
    List<TipoDocumentoEntity> listarTodos();
    Optional<TipoDocumentoEntity> buscarPorId(Integer id);
    TipoDocumentoEntity guardar(TipoDocumentoEntity entity);
    TipoDocumentoEntity actualizar(TipoDocumentoEntity entity);
    void eliminar(Integer id);
}