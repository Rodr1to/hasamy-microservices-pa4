package com.example.demo.service.impl;

import com.example.demo.entity.ControlPuerta;
import com.example.demo.repository.ControlPuertaRepository;
import com.example.demo.service.ControlPuertaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ControlPuertaServiceImpl implements ControlPuertaService {
    private final ControlPuertaRepository repository;

    @Override
    public List<ControlPuerta> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<ControlPuerta> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public ControlPuerta guardar(ControlPuerta entidad) {
        return repository.save(entidad);
    }

    @Override
    public ControlPuerta actualizar(ControlPuerta entidad) {
        return repository.save(entidad);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
