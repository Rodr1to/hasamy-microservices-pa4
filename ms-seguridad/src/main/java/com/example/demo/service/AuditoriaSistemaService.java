package com.example.demo.service;

import com.example.demo.entity.AuditoriaSistema;
import java.util.List;
import java.util.Optional;

public interface AuditoriaSistemaService {
    List<AuditoriaSistema> listarTodos();
    Optional<AuditoriaSistema> buscarPorId(Integer id);
    AuditoriaSistema guardar(AuditoriaSistema auditoriaSistema);
    AuditoriaSistema actualizar(AuditoriaSistema auditoriaSistema);
    void eliminar(Integer id);
}