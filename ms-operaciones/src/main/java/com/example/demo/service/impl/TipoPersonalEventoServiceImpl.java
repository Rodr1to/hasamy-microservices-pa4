package com.example.demo.service.impl;

import com.example.demo.entity.TipoPersonalEvento;
import com.example.demo.repository.TipoPersonalEventoRepository;
import com.example.demo.service.TipoPersonalEventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TipoPersonalEventoServiceImpl implements TipoPersonalEventoService {
    private final TipoPersonalEventoRepository repository;

    @Override
    public List<TipoPersonalEvento> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<TipoPersonalEvento> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public TipoPersonalEvento guardar(TipoPersonalEvento entidad) {
        return repository.save(entidad);
    }

    @Override
    public TipoPersonalEvento actualizar(TipoPersonalEvento entidad) {
        return repository.save(entidad);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
