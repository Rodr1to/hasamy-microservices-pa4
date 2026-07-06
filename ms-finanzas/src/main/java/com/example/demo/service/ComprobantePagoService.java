package com.example.demo.service;

import com.example.demo.entity.ComprobantePagoEntity;
import java.util.List;
import java.util.Optional;

public interface ComprobantePagoService {
    List<ComprobantePagoEntity> listarTodos();
    Optional<ComprobantePagoEntity> buscarPorId(Integer id);
    ComprobantePagoEntity guardar(ComprobantePagoEntity entity);
    ComprobantePagoEntity actualizar(ComprobantePagoEntity entity);
    void eliminar(Integer id);
}
