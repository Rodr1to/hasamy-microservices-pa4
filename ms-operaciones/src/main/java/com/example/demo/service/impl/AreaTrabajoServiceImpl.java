package com.example.demo.service.impl;

import com.example.demo.entity.AreaTrabajo;
import com.example.demo.repository.AreaTrabajoRepository;
import com.example.demo.service.AreaTrabajoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AreaTrabajoServiceImpl implements AreaTrabajoService {
    private final AreaTrabajoRepository repository;

    @Override
    public List<AreaTrabajo> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<AreaTrabajo> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public AreaTrabajo guardar(AreaTrabajo entidad) {
        return repository.save(entidad);
    }

    @Override
    public AreaTrabajo actualizar(AreaTrabajo entidad) {
        return repository.save(entidad);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
