package com.example.demo.service.impl;

import com.example.demo.entity.MetodoPagoEntity;
import com.example.demo.repository.MetodoPagoRepository;
import com.example.demo.service.MetodoPagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MetodoPagoServiceImpl implements MetodoPagoService {

    private final MetodoPagoRepository repository;

    @Override
    public List<MetodoPagoEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<MetodoPagoEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public MetodoPagoEntity guardar(MetodoPagoEntity entity) {
        return repository.save(entity);
    }

    @Override
    public MetodoPagoEntity actualizar(MetodoPagoEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
