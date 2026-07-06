package com.example.demo.service.impl;

import com.example.demo.entity.VueloPonente;
import com.example.demo.repository.VueloPonenteRepository;
import com.example.demo.service.VueloPonenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VueloPonenteServiceImpl implements VueloPonenteService {
    private final VueloPonenteRepository repository;

    @Override
    public List<VueloPonente> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<VueloPonente> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public VueloPonente guardar(VueloPonente entidad) {
        return repository.save(entidad);
    }

    @Override
    public VueloPonente actualizar(VueloPonente entidad) {
        return repository.save(entidad);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
