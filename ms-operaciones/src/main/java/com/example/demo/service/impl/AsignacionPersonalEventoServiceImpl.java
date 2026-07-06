package com.example.demo.service.impl;

import com.example.demo.entity.AsignacionPersonalEvento;
import com.example.demo.repository.AsignacionPersonalEventoRepository;
import com.example.demo.service.AsignacionPersonalEventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AsignacionPersonalEventoServiceImpl implements AsignacionPersonalEventoService {
    private final AsignacionPersonalEventoRepository repository;

    @Override
    public List<AsignacionPersonalEvento> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<AsignacionPersonalEvento> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public AsignacionPersonalEvento guardar(AsignacionPersonalEvento entidad) {
        return repository.save(entidad);
    }

    @Override
    public AsignacionPersonalEvento actualizar(AsignacionPersonalEvento entidad) {
        return repository.save(entidad);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
