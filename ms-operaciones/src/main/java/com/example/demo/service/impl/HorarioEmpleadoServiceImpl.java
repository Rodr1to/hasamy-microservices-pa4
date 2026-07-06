package com.example.demo.service.impl;

import com.example.demo.entity.HorarioEmpleado;
import com.example.demo.repository.HorarioEmpleadoRepository;
import com.example.demo.service.HorarioEmpleadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HorarioEmpleadoServiceImpl implements HorarioEmpleadoService {
    private final HorarioEmpleadoRepository repository;

    @Override
    public List<HorarioEmpleado> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<HorarioEmpleado> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public HorarioEmpleado guardar(HorarioEmpleado entidad) {
        return repository.save(entidad);
    }

    @Override
    public HorarioEmpleado actualizar(HorarioEmpleado entidad) {
        return repository.save(entidad);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
