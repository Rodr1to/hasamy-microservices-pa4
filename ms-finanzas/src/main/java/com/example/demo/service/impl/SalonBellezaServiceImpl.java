package com.example.demo.service.impl;

import com.example.demo.entity.SalonBellezaEntity;
import com.example.demo.repository.SalonBellezaRepository;
import com.example.demo.service.SalonBellezaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SalonBellezaServiceImpl implements SalonBellezaService {

    private final SalonBellezaRepository repository;

    @Override
    public List<SalonBellezaEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<SalonBellezaEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public SalonBellezaEntity guardar(SalonBellezaEntity entity) {
        return repository.save(entity);
    }

    @Override
    public SalonBellezaEntity actualizar(SalonBellezaEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}