package com.example.demo.service.impl;

import com.example.demo.entity.EstadoAsistenciaEntity;
import com.example.demo.repository.EstadoAsistenciaRepository;
import com.example.demo.service.EstadoAsistenciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EstadoAsistenciaServiceImpl implements EstadoAsistenciaService {

    private final EstadoAsistenciaRepository repository;

    @Override
    public List<EstadoAsistenciaEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<EstadoAsistenciaEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public EstadoAsistenciaEntity guardar(EstadoAsistenciaEntity entity) {
        return repository.save(entity);
    }

    @Override
    public EstadoAsistenciaEntity actualizar(EstadoAsistenciaEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
