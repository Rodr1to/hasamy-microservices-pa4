package com.example.demo.service.impl;

import com.example.demo.entity.AsistenciaEmpleado;
import com.example.demo.repository.AsistenciaEmpleadoRepository;
import com.example.demo.service.AsistenciaEmpleadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AsistenciaEmpleadoServiceImpl implements AsistenciaEmpleadoService {
    private final AsistenciaEmpleadoRepository repository;

    @Override
    public List<AsistenciaEmpleado> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<AsistenciaEmpleado> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public AsistenciaEmpleado guardar(AsistenciaEmpleado entidad) {
        return repository.save(entidad);
    }

    @Override
    public AsistenciaEmpleado actualizar(AsistenciaEmpleado entidad) {
        return repository.save(entidad);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
