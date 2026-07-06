package com.example.demo.service;

import com.example.demo.entity.CargoEmpleado;
import java.util.List;
import java.util.Optional;

public interface CargoEmpleadoService {
    List<CargoEmpleado> listarTodos();
    Optional<CargoEmpleado> buscarPorId(Integer id);
    CargoEmpleado guardar(CargoEmpleado entidad);
    CargoEmpleado actualizar(CargoEmpleado entidad);
    void eliminar(Integer id);
}
