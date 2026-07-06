package com.example.demo.service;

import com.example.demo.entity.RolSistema;
import java.util.List;
import java.util.Optional;

public interface RolSistemaService {
    List<RolSistema> listarTodos();
    Optional<RolSistema> buscarPorId(Integer id);
    RolSistema guardar(RolSistema rolSistema);
    RolSistema actualizar(RolSistema rolSistema);
    void eliminar(Integer id);
}