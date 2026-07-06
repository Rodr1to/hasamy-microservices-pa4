package com.example.demo.service;

import com.example.demo.entity.KitLogistico;
import java.util.List;
import java.util.Optional;

public interface KitLogisticoService {
    List<KitLogistico> listarTodos();
    Optional<KitLogistico> buscarPorId(Integer id);
    KitLogistico guardar(KitLogistico entidad);
    KitLogistico actualizar(KitLogistico entidad);
    void eliminar(Integer id);
}
