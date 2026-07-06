package com.example.demo.service.impl;

import com.example.demo.entity.TipoDocumentoEntity;
import com.example.demo.repository.TipoDocumentoRepository;
import com.example.demo.service.TipoDocumentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TipoDocumentoServiceImpl implements TipoDocumentoService {

    private final TipoDocumentoRepository repository;

    @Override
    public List<TipoDocumentoEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<TipoDocumentoEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public TipoDocumentoEntity guardar(TipoDocumentoEntity entity) {
        return repository.save(entity);
    }

    @Override
    public TipoDocumentoEntity actualizar(TipoDocumentoEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
