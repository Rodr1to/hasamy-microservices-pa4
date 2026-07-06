package com.example.demo.service.impl;

import com.example.demo.entity.PaisEntity;
import com.example.demo.repository.PaisRepository;
import com.example.demo.service.PaisService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PaisServiceImpl implements PaisService {

    private final PaisRepository repository;

    @Override
    public List<PaisEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<PaisEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public PaisEntity guardar(PaisEntity entity) {
        return repository.save(entity);
    }

    @Override
    public PaisEntity actualizar(PaisEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
