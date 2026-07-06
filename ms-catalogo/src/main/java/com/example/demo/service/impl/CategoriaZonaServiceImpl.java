package com.example.demo.service.impl;

import com.example.demo.entity.CategoriaZonaEntity;
import com.example.demo.repository.CategoriaZonaRepository;
import com.example.demo.service.CategoriaZonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoriaZonaServiceImpl implements CategoriaZonaService {

    private final CategoriaZonaRepository repository;

    @Override
    public List<CategoriaZonaEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<CategoriaZonaEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public CategoriaZonaEntity guardar(CategoriaZonaEntity entity) {
        return repository.save(entity);
    }

    @Override
    public CategoriaZonaEntity actualizar(CategoriaZonaEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
