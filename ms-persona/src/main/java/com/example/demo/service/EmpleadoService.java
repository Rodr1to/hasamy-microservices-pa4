package com.example.demo.service;

import com.example.demo.entity.Empleado;
import java.util.List;
import java.util.Optional;

public interface EmpleadoService {
    List<Empleado> listarTodos();
    Optional<Empleado> buscarPorId(Integer id);
    Empleado guardar(Empleado empleado);
    Empleado actualizar(Empleado empleado);
    void eliminar(Integer id);
}
