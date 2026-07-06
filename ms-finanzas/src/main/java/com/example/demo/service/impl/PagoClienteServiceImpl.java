package com.example.demo.service.impl;

import com.example.demo.entity.PagoClienteEntity;
import com.example.demo.repository.PagoClienteRepository;
import com.example.demo.service.PagoClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PagoClienteServiceImpl implements PagoClienteService {

    private final PagoClienteRepository repository;

    @Override
    public List<PagoClienteEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<PagoClienteEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public PagoClienteEntity guardar(PagoClienteEntity entity) {
        return repository.save(entity);
    }

    @Override
    public PagoClienteEntity actualizar(PagoClienteEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}