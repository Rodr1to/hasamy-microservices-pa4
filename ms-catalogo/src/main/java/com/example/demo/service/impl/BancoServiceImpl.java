package com.example.demo.service.impl;

import com.example.demo.entity.BancoEntity;
import com.example.demo.repository.BancoRepository;
import com.example.demo.service.BancoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BancoServiceImpl implements BancoService {

    private final BancoRepository repository;

    @Override
    public List<BancoEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<BancoEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public BancoEntity guardar(BancoEntity entity) {
        return repository.save(entity);
    }

    @Override
    public BancoEntity actualizar(BancoEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
