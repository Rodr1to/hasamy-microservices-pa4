package com.example.demo.service.impl;

import com.example.demo.entity.ModuloSistema;
import com.example.demo.repository.ModuloSistemaRepository;
import com.example.demo.service.ModuloSistemaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ModuloSistemaServiceImpl implements ModuloSistemaService {

    private final ModuloSistemaRepository repository;

    @Override
    public List<ModuloSistema> listarTodos() { return repository.findAll(); }

    @Override
    public Optional<ModuloSistema> buscarPorId(Integer id) { return repository.findById(id); }

    @Override
    public ModuloSistema guardar(ModuloSistema moduloSistema) { return repository.save(moduloSistema); }

    @Override
    public ModuloSistema actualizar(ModuloSistema moduloSistema) { return repository.save(moduloSistema); }

    @Override
    public void eliminar(Integer id) { repository.deleteById(id); }
}