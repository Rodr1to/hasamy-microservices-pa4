package com.example.demo.service;

import com.example.demo.entity.ModuloSistema;
import java.util.List;
import java.util.Optional;

public interface ModuloSistemaService {
    List<ModuloSistema> listarTodos();
    Optional<ModuloSistema> buscarPorId(Integer id);
    ModuloSistema guardar(ModuloSistema moduloSistema);
    ModuloSistema actualizar(ModuloSistema moduloSistema);
    void eliminar(Integer id);
}