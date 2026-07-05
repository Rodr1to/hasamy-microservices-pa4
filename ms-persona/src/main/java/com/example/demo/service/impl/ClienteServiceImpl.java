package com.example.demo.service.impl;

import com.example.demo.entity.Cliente;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository repository;

    @Override
    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<Cliente> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Cliente actualizar(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
