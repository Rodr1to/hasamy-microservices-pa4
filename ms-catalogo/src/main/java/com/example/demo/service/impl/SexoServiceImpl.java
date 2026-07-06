package com.example.demo.service.impl;

import com.example.demo.entity.SexoEntity;
import com.example.demo.repository.SexoRepository;
import com.example.demo.service.SexoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SexoServiceImpl implements SexoService {

    private final SexoRepository repository;

    @Override
    public List<SexoEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<SexoEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public SexoEntity guardar(SexoEntity entity) {
        return repository.save(entity);
    }

    @Override
    public SexoEntity actualizar(SexoEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
