package com.example.demo.service;

import com.example.demo.entity.ControlPuerta;
import java.util.List;
import java.util.Optional;

public interface ControlPuertaService {
    List<ControlPuerta> listarTodos();
    Optional<ControlPuerta> buscarPorId(Integer id);
    ControlPuerta guardar(ControlPuerta entidad);
    ControlPuerta actualizar(ControlPuerta entidad);
    void eliminar(Integer id);
}
