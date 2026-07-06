package com.example.demo.service.impl;

import com.example.demo.entity.EstadoCivilEntity;
import com.example.demo.repository.EstadoCivilRepository;
import com.example.demo.service.EstadoCivilService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EstadoCivilServiceImpl implements EstadoCivilService {

    private final EstadoCivilRepository repository;

    @Override
    public List<EstadoCivilEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<EstadoCivilEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public EstadoCivilEntity guardar(EstadoCivilEntity entity) {
        return repository.save(entity);
    }

    @Override
    public EstadoCivilEntity actualizar(EstadoCivilEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
