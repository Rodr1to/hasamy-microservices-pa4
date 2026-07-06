package com.example.demo.service.impl;

import com.example.demo.entity.Evento;
import com.example.demo.repository.EventoRepository;
import com.example.demo.service.EventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EventoServiceImpl implements EventoService {
    private final EventoRepository repository;

    @Override
    public List<Evento> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<Evento> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Evento guardar(Evento entidad) {
        return repository.save(entidad);
    }

    @Override
    public Evento actualizar(Evento entidad) {
        return repository.save(entidad);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
