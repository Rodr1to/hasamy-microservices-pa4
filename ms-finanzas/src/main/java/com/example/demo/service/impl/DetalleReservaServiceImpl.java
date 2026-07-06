package com.example.demo.service.impl;

import com.example.demo.entity.DetalleReservaEntity;
import com.example.demo.repository.DetalleReservaRepository;
import com.example.demo.service.DetalleReservaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DetalleReservaServiceImpl implements DetalleReservaService {

    private final DetalleReservaRepository repository;

    @Override
    public List<DetalleReservaEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<DetalleReservaEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public DetalleReservaEntity guardar(DetalleReservaEntity entity) {
        return repository.save(entity);
    }

    @Override
    public DetalleReservaEntity actualizar(DetalleReservaEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}