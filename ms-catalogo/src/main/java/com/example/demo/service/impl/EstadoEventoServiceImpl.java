package com.example.demo.service.impl;

import com.example.demo.entity.EstadoEventoEntity;
import com.example.demo.repository.EstadoEventoRepository;
import com.example.demo.service.EstadoEventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EstadoEventoServiceImpl implements EstadoEventoService {

    private final EstadoEventoRepository repository;

    @Override
    public List<EstadoEventoEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<EstadoEventoEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public EstadoEventoEntity guardar(EstadoEventoEntity entity) {
        return repository.save(entity);
    }

    @Override
    public EstadoEventoEntity actualizar(EstadoEventoEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
