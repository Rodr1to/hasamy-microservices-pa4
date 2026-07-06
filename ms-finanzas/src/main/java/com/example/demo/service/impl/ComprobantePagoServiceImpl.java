package com.example.demo.service.impl;

import com.example.demo.entity.ComprobantePagoEntity;
import com.example.demo.repository.ComprobantePagoRepository;
import com.example.demo.service.ComprobantePagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ComprobantePagoServiceImpl implements ComprobantePagoService {

    private final ComprobantePagoRepository repository;

    @Override
    public List<ComprobantePagoEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<ComprobantePagoEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public ComprobantePagoEntity guardar(ComprobantePagoEntity entity) {
        return repository.save(entity);
    }

    @Override
    public ComprobantePagoEntity actualizar(ComprobantePagoEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}