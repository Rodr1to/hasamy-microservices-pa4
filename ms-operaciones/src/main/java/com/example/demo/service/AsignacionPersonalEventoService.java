package com.example.demo.service;

import com.example.demo.entity.AsignacionPersonalEvento;
import java.util.List;
import java.util.Optional;

public interface AsignacionPersonalEventoService {
    List<AsignacionPersonalEvento> listarTodos();
    Optional<AsignacionPersonalEvento> buscarPorId(Integer id);
    AsignacionPersonalEvento guardar(AsignacionPersonalEvento entidad);
    AsignacionPersonalEvento actualizar(AsignacionPersonalEvento entidad);
    void eliminar(Integer id);
}
