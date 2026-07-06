package com.example.demo.service.impl;

import com.example.demo.entity.AerolineaEntity;
import com.example.demo.repository.AerolineaRepository;
import com.example.demo.service.AerolineaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AerolineaServiceImpl implements AerolineaService {

    private final AerolineaRepository repository;

    @Override
    public List<AerolineaEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<AerolineaEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public AerolineaEntity guardar(AerolineaEntity entity) {
        return repository.save(entity);
    }

    @Override
    public AerolineaEntity actualizar(AerolineaEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
