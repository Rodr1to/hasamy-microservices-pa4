package com.example.demo.service;

import com.example.demo.entity.TipoPersonalEvento;
import java.util.List;
import java.util.Optional;

public interface TipoPersonalEventoService {
    List<TipoPersonalEvento> listarTodos();
    Optional<TipoPersonalEvento> buscarPorId(Integer id);
    TipoPersonalEvento guardar(TipoPersonalEvento entidad);
    TipoPersonalEvento actualizar(TipoPersonalEvento entidad);
    void eliminar(Integer id);
}
