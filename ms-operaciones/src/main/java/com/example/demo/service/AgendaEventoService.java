package com.example.demo.service;

import com.example.demo.entity.AgendaEvento;
import java.util.List;
import java.util.Optional;

public interface AgendaEventoService {
    List<AgendaEvento> listarTodos();
    Optional<AgendaEvento> buscarPorId(Integer id);
    AgendaEvento guardar(AgendaEvento entidad);
    AgendaEvento actualizar(AgendaEvento entidad);
    void eliminar(Integer id);
}
