package com.example.demo.service.impl;

import com.example.demo.entity.EstadoReservaEntity;
import com.example.demo.repository.EstadoReservaRepository;
import com.example.demo.service.EstadoReservaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EstadoReservaServiceImpl implements EstadoReservaService {

    private final EstadoReservaRepository repository;

    @Override
    public List<EstadoReservaEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<EstadoReservaEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public EstadoReservaEntity guardar(EstadoReservaEntity entity) {
        return repository.save(entity);
    }

    @Override
    public EstadoReservaEntity actualizar(EstadoReservaEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
