package com.example.demo.service.impl;

import com.example.demo.entity.UsuarioRol;
import com.example.demo.entity.UsuarioRolId;
import com.example.demo.repository.UsuarioRolRepository;
import com.example.demo.service.UsuarioRolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioRolServiceImpl implements UsuarioRolService {

    private final UsuarioRolRepository repository;

    @Override
    public List<UsuarioRol> listarTodos() { return repository.findAll(); }

    @Override
    public Optional<UsuarioRol> buscarPorId(Integer usuarioId, Integer rolId) {
        UsuarioRolId id = new UsuarioRolId();
        id.setUsuarioId(usuarioId);
        id.setRolId(rolId);
        return repository.findById(id);
    }

    @Override
    public UsuarioRol guardar(UsuarioRol usuarioRol) { return repository.save(usuarioRol); }

    @Override
    public void eliminar(Integer usuarioId, Integer rolId) {
        UsuarioRolId id = new UsuarioRolId();
        id.setUsuarioId(usuarioId);
        id.setRolId(rolId);
        repository.deleteById(id);
    }
}