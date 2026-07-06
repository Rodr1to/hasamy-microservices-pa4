package com.example.demo.service;

import com.example.demo.entity.AreaTrabajo;
import java.util.List;
import java.util.Optional;

public interface AreaTrabajoService {
    List<AreaTrabajo> listarTodos();
    Optional<AreaTrabajo> buscarPorId(Integer id);
    AreaTrabajo guardar(AreaTrabajo entidad);
    AreaTrabajo actualizar(AreaTrabajo entidad);
    void eliminar(Integer id);
}
