package com.example.demo.service;

import com.example.demo.entity.Evento;
import java.util.List;
import java.util.Optional;

public interface EventoService {
    List<Evento> listarTodos();
    Optional<Evento> buscarPorId(Integer id);
    Evento guardar(Evento entidad);
    Evento actualizar(Evento entidad);
    void eliminar(Integer id);
}
