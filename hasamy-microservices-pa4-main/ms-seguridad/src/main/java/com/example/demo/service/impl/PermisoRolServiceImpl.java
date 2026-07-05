package com.example.demo.service.impl;

import com.example.demo.entity.PermisoRol;
import com.example.demo.entity.PermisoRolId;
import com.example.demo.repository.PermisoRolRepository;
import com.example.demo.service.PermisoRolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PermisoRolServiceImpl implements PermisoRolService {

    private final PermisoRolRepository repository;

    @Override
    public List<PermisoRol> listarTodos() { return repository.findAll(); }

    @Override
    public Optional<PermisoRol> buscarPorId(Integer rolId, Integer moduloId) {
        PermisoRolId id = new PermisoRolId();
        id.setRolId(rolId);
        id.setModuloId(moduloId);
        return repository.findById(id);
    }

    @Override
    public PermisoRol guardar(PermisoRol permisoRol) { return repository.save(permisoRol); }

    @Override
    public PermisoRol actualizar(PermisoRol permisoRol) { return repository.save(permisoRol); }

    @Override
    public void eliminar(Integer rolId, Integer moduloId) {
        PermisoRolId id = new PermisoRolId();
        id.setRolId(rolId);
        id.setModuloId(moduloId);
        repository.deleteById(id);
    }
}