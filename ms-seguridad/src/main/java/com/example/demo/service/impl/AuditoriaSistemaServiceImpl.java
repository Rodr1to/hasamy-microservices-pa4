package com.example.demo.service.impl;

import com.example.demo.entity.AuditoriaSistema;
import com.example.demo.repository.AuditoriaSistemaRepository;
import com.example.demo.service.AuditoriaSistemaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuditoriaSistemaServiceImpl implements AuditoriaSistemaService {

    private final AuditoriaSistemaRepository repository;

    @Override
    public List<AuditoriaSistema> listarTodos() { return repository.findAll(); }

    @Override
    public Optional<AuditoriaSistema> buscarPorId(Integer id) { return repository.findById(id); }

    @Override
    public AuditoriaSistema guardar(AuditoriaSistema auditoriaSistema) { return repository.save(auditoriaSistema); }

    @Override
    public AuditoriaSistema actualizar(AuditoriaSistema auditoriaSistema) { return repository.save(auditoriaSistema); }

    @Override
    public void eliminar(Integer id) { repository.deleteById(id); }
}