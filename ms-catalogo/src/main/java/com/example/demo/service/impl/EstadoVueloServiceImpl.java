package com.example.demo.service.impl;

import com.example.demo.entity.EstadoVueloEntity;
import com.example.demo.repository.EstadoVueloRepository;
import com.example.demo.service.EstadoVueloService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EstadoVueloServiceImpl implements EstadoVueloService {

    private final EstadoVueloRepository repository;

    @Override
    public List<EstadoVueloEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<EstadoVueloEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public EstadoVueloEntity guardar(EstadoVueloEntity entity) {
        return repository.save(entity);
    }

    @Override
    public EstadoVueloEntity actualizar(EstadoVueloEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
