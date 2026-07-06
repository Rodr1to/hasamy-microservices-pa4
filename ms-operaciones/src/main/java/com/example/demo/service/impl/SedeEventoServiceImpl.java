package com.example.demo.service.impl;

import com.example.demo.entity.SedeEvento;
import com.example.demo.repository.SedeEventoRepository;
import com.example.demo.service.SedeEventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SedeEventoServiceImpl implements SedeEventoService {
    private final SedeEventoRepository repository;

    @Override
    public List<SedeEvento> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<SedeEvento> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public SedeEvento guardar(SedeEvento entidad) {
        return repository.save(entidad);
    }

    @Override
    public SedeEvento actualizar(SedeEvento entidad) {
        return repository.save(entidad);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
