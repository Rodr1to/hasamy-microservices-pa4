package com.example.demo.service.impl;

import com.example.demo.entity.CargoEmpleado;
import com.example.demo.repository.CargoEmpleadoRepository;
import com.example.demo.service.CargoEmpleadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CargoEmpleadoServiceImpl implements CargoEmpleadoService {
    private final CargoEmpleadoRepository repository;

    @Override
    public List<CargoEmpleado> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<CargoEmpleado> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public CargoEmpleado guardar(CargoEmpleado entidad) {
        return repository.save(entidad);
    }

    @Override
    public CargoEmpleado actualizar(CargoEmpleado entidad) {
        return repository.save(entidad);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
