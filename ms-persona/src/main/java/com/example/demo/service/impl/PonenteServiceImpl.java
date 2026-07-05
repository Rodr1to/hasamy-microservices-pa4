package com.example.demo.service.impl;

import com.example.demo.entity.Ponente;
import com.example.demo.repository.PonenteRepository;
import com.example.demo.service.PonenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PonenteServiceImpl implements PonenteService {
    @Autowired
    private PonenteRepository repository;

    @Override
    public List<Ponente> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<Ponente> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Ponente actualizar(Ponente ponente) {
        return repository.save(ponente);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
