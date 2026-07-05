package com.example.demo.service.impl;

import com.example.demo.entity.RolSistema;
import com.example.demo.repository.RolSistemaRepository;
import com.example.demo.service.RolSistemaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RolSistemaServiceImpl implements RolSistemaService {

    private final RolSistemaRepository repository;

    @Override
    public List<RolSistema> listarTodos() { return repository.findAll(); }

    @Override
    public Optional<RolSistema> buscarPorId(Integer id) { return repository.findById(id); }

    @Override
    public RolSistema guardar(RolSistema rolSistema) { return repository.save(rolSistema); }

    @Override
    public RolSistema actualizar(RolSistema rolSistema) { return repository.save(rolSistema); }

    @Override
    public void eliminar(Integer id) { repository.deleteById(id); }
}