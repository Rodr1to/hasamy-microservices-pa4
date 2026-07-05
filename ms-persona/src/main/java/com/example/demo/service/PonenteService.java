package com.example.demo.service;

import com.example.demo.entity.Ponente;
import java.util.List;
import java.util.Optional;

public interface PonenteService {
    List<Ponente> listarTodos();
    Optional<Ponente> buscarPorId(Integer id);
    Ponente actualizar(Ponente ponente);
    void eliminar(Integer id);
}
