package com.example.demo.service;

import com.example.demo.entity.PagoClienteEntity;
import java.util.List;
import java.util.Optional;

public interface PagoClienteService {
    List<PagoClienteEntity> listarTodos();
    Optional<PagoClienteEntity> buscarPorId(Integer id);
    PagoClienteEntity guardar(PagoClienteEntity entity);
    PagoClienteEntity actualizar(PagoClienteEntity entity);
    void eliminar(Integer id);
}
