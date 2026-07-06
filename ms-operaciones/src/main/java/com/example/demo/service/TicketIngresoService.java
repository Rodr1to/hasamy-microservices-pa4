package com.example.demo.service;

import com.example.demo.entity.TicketIngreso;
import java.util.List;
import java.util.Optional;

public interface TicketIngresoService {
    List<TicketIngreso> listarTodos();
    Optional<TicketIngreso> buscarPorId(Integer id);
    TicketIngreso guardar(TicketIngreso entidad);
    TicketIngreso actualizar(TicketIngreso entidad);
    void eliminar(Integer id);
}
