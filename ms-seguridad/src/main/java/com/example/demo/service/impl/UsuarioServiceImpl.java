package com.example.demo.service.impl;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository repository;

    @Override
    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<Usuario> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    public Usuario actualizar(Usuario usuario) {
        // En JPA, el método save() funciona para insertar y para actualizar
        return repository.save(usuario);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}