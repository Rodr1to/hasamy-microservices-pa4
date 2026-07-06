package com.example.demo.service.impl;

import com.example.demo.entity.TicketIngreso;
import com.example.demo.repository.TicketIngresoRepository;
import com.example.demo.service.TicketIngresoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TicketIngresoServiceImpl implements TicketIngresoService {
    private final TicketIngresoRepository repository;

    @Override
    public List<TicketIngreso> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<TicketIngreso> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public TicketIngreso guardar(TicketIngreso entidad) {
        return repository.save(entidad);
    }

    @Override
    public TicketIngreso actualizar(TicketIngreso entidad) {
        return repository.save(entidad);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
