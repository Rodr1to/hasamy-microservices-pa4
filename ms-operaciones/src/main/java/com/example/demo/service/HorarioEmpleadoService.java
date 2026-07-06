package com.example.demo.service;

import com.example.demo.entity.HorarioEmpleado;
import java.util.List;
import java.util.Optional;

public interface HorarioEmpleadoService {
    List<HorarioEmpleado> listarTodos();
    Optional<HorarioEmpleado> buscarPorId(Integer id);
    HorarioEmpleado guardar(HorarioEmpleado entidad);
    HorarioEmpleado actualizar(HorarioEmpleado entidad);
    void eliminar(Integer id);
}
