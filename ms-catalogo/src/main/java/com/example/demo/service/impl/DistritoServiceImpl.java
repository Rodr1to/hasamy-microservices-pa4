package com.example.demo.service.impl;

import com.example.demo.entity.DistritoEntity;
import com.example.demo.repository.DistritoRepository;
import com.example.demo.service.DistritoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DistritoServiceImpl implements DistritoService {

    private final DistritoRepository repository;

    @Override
    public List<DistritoEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<DistritoEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public DistritoEntity guardar(DistritoEntity entity) {
        return repository.save(entity);
    }

    @Override
    public DistritoEntity actualizar(DistritoEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
