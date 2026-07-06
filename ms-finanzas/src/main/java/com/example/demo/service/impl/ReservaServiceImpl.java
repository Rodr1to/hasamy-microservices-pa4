package com.example.demo.service.impl;

import com.example.demo.entity.ReservaEntity;
import com.example.demo.repository.ReservaRepository;
import com.example.demo.service.ReservaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReservaServiceImpl implements ReservaService {

    private final ReservaRepository repository;

    @Override
    public List<ReservaEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<ReservaEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public ReservaEntity guardar(ReservaEntity entity) {
        return repository.save(entity);
    }

    @Override
    public ReservaEntity actualizar(ReservaEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}