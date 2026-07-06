package com.example.demo.service;

import com.example.demo.entity.SedeEvento;
import java.util.List;
import java.util.Optional;

public interface SedeEventoService {
    List<SedeEvento> listarTodos();
    Optional<SedeEvento> buscarPorId(Integer id);
    SedeEvento guardar(SedeEvento entidad);
    SedeEvento actualizar(SedeEvento entidad);
    void eliminar(Integer id);
}
