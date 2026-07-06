package com.example.demo.service.impl;

import com.example.demo.entity.IncidenciaEvento;
import com.example.demo.repository.IncidenciaEventoRepository;
import com.example.demo.service.IncidenciaEventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class IncidenciaEventoServiceImpl implements IncidenciaEventoService {
    private final IncidenciaEventoRepository repository;

    @Override
    public List<IncidenciaEvento> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<IncidenciaEvento> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public IncidenciaEvento guardar(IncidenciaEvento entidad) {
        return repository.save(entidad);
    }

    @Override
    public IncidenciaEvento actualizar(IncidenciaEvento entidad) {
        return repository.save(entidad);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
