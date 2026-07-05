package com.example.demo.service.impl;

import com.example.demo.entity.Empleado;
import com.example.demo.repository.EmpleadoRepository;
import com.example.demo.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
    @Autowired
    private EmpleadoRepository repository;

    @Override
    public List<Empleado> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<Empleado> buscarPorId (Integer id) {
        return repository.findById(id);
    }

    @Override
    public Empleado actualizar(Empleado empleado) {
        return repository.save(empleado);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }

}
