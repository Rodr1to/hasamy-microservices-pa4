package com.example.demo.service;

import com.example.demo.entity.IncidenciaEvento;
import java.util.List;
import java.util.Optional;

public interface IncidenciaEventoService {
    List<IncidenciaEvento> listarTodos();
    Optional<IncidenciaEvento> buscarPorId(Integer id);
    IncidenciaEvento guardar(IncidenciaEvento entidad);
    IncidenciaEvento actualizar(IncidenciaEvento entidad);
    void eliminar(Integer id);
}
