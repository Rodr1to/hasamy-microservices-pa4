package com.example.demo.service.impl;

import com.example.demo.entity.EstadoPagoEntity;
import com.example.demo.repository.EstadoPagoRepository;
import com.example.demo.service.EstadoPagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EstadoPagoServiceImpl implements EstadoPagoService {

    private final EstadoPagoRepository repository;

    @Override
    public List<EstadoPagoEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<EstadoPagoEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public EstadoPagoEntity guardar(EstadoPagoEntity entity) {
        return repository.save(entity);
    }

    @Override
    public EstadoPagoEntity actualizar(EstadoPagoEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
