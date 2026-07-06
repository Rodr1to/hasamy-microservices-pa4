package com.example.demo.service;

import com.example.demo.entity.ZonaEvento;
import java.util.List;
import java.util.Optional;

public interface ZonaEventoService {
    List<ZonaEvento> listarTodos();
    Optional<ZonaEvento> buscarPorId(Integer id);
    ZonaEvento guardar(ZonaEvento entidad);
    ZonaEvento actualizar(ZonaEvento entidad);
    void eliminar(Integer id);
}
