package com.example.demo.service;

import com.example.demo.entity.AsistenciaEmpleado;
import java.util.List;
import java.util.Optional;

public interface AsistenciaEmpleadoService {
    List<AsistenciaEmpleado> listarTodos();
    Optional<AsistenciaEmpleado> buscarPorId(Integer id);
    AsistenciaEmpleado guardar(AsistenciaEmpleado entidad);
    AsistenciaEmpleado actualizar(AsistenciaEmpleado entidad);
    void eliminar(Integer id);
}
