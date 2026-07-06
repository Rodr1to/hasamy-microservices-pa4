package com.example.demo.service.impl;

import com.example.demo.entity.KitLogistico;
import com.example.demo.repository.KitLogisticoRepository;
import com.example.demo.service.KitLogisticoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class KitLogisticoServiceImpl implements KitLogisticoService {
    private final KitLogisticoRepository repository;

    @Override
    public List<KitLogistico> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<KitLogistico> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public KitLogistico guardar(KitLogistico entidad) {
        return repository.save(entidad);
    }

    @Override
    public KitLogistico actualizar(KitLogistico entidad) {
        return repository.save(entidad);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
