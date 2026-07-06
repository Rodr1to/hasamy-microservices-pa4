package com.example.demo.service.impl;

import com.example.demo.entity.AgendaEvento;
import com.example.demo.repository.AgendaEventoRepository;
import com.example.demo.service.AgendaEventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AgendaEventoServiceImpl implements AgendaEventoService {
    private final AgendaEventoRepository repository;

    @Override
    public List<AgendaEvento> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<AgendaEvento> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public AgendaEvento guardar(AgendaEvento entidad) {
        return repository.save(entidad);
    }

    @Override
    public AgendaEvento actualizar(AgendaEvento entidad) {
        return repository.save(entidad);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
