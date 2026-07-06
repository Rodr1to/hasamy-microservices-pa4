package com.example.demo.service;

import com.example.demo.entity.PermisoRol;
import java.util.List;
import java.util.Optional;

public interface PermisoRolService {
    List<PermisoRol> listarTodos();
    Optional<PermisoRol> buscarPorId(Integer rolId, Integer moduloId);
    PermisoRol guardar(PermisoRol permisoRol);
    PermisoRol actualizar(PermisoRol permisoRol);
    void eliminar(Integer rolId, Integer moduloId);
}