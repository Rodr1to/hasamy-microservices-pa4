package com.example.demo.service;

import com.example.demo.entity.TurnoLaboral;
import java.util.List;
import java.util.Optional;

public interface TurnoLaboralService {
    List<TurnoLaboral> listarTodos();
    Optional<TurnoLaboral> buscarPorId(Integer id);
    TurnoLaboral guardar(TurnoLaboral entidad);
    TurnoLaboral actualizar(TurnoLaboral entidad);
    void eliminar(Integer id);
}
