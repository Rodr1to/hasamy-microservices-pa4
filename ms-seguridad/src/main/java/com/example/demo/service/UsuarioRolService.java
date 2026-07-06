package com.example.demo.service;

import com.example.demo.entity.UsuarioRol;
import java.util.List;
import java.util.Optional;

public interface UsuarioRolService {
    List<UsuarioRol> listarTodos();
    Optional<UsuarioRol> buscarPorId(Integer usuarioId, Integer rolId);
    UsuarioRol guardar(UsuarioRol usuarioRol);
    void eliminar(Integer usuarioId, Integer rolId);
}