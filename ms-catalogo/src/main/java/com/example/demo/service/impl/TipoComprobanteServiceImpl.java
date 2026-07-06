package com.example.demo.service.impl;

import com.example.demo.entity.TipoComprobanteEntity;
import com.example.demo.repository.TipoComprobanteRepository;
import com.example.demo.service.TipoComprobanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TipoComprobanteServiceImpl implements TipoComprobanteService {

    private final TipoComprobanteRepository repository;

    @Override
    public List<TipoComprobanteEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<TipoComprobanteEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public TipoComprobanteEntity guardar(TipoComprobanteEntity entity) {
        return repository.save(entity);
    }

    @Override
    public TipoComprobanteEntity actualizar(TipoComprobanteEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
