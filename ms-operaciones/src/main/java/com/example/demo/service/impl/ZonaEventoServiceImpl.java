package com.example.demo.service.impl;

import com.example.demo.entity.ZonaEvento;
import com.example.demo.repository.ZonaEventoRepository;
import com.example.demo.service.ZonaEventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ZonaEventoServiceImpl implements ZonaEventoService {
    private final ZonaEventoRepository repository;

    @Override
    public List<ZonaEvento> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<ZonaEvento> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public ZonaEvento guardar(ZonaEvento entidad) {
        return repository.save(entidad);
    }

    @Override
    public ZonaEvento actualizar(ZonaEvento entidad) {
        return repository.save(entidad);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
