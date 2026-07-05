package com.example.demo.service.impl;

import com.example.demo.entity.Ponente;
import com.example.demo.repository.PonenteRepository;
import com.example.demo.service.PonenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PonenteServiceImpl implements PonenteService {
    private final PonenteRepository repository;

    @Override
    public List<Ponente> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<Ponente> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Ponente guardar(Ponente ponente) {
        return repository.save(ponente);
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
