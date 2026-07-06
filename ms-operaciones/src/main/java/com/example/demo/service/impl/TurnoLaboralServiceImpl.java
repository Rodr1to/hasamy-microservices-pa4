package com.example.demo.service.impl;

import com.example.demo.entity.TurnoLaboral;
import com.example.demo.repository.TurnoLaboralRepository;
import com.example.demo.service.TurnoLaboralService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TurnoLaboralServiceImpl implements TurnoLaboralService {
    private final TurnoLaboralRepository repository;

    @Override
    public List<TurnoLaboral> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<TurnoLaboral> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public TurnoLaboral guardar(TurnoLaboral entidad) {
        return repository.save(entidad);
    }

    @Override
    public TurnoLaboral actualizar(TurnoLaboral entidad) {
        return repository.save(entidad);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
