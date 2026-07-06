package com.example.demo.service.impl;

import com.example.demo.entity.CertificadoAsistencia;
import com.example.demo.repository.CertificadoAsistenciaRepository;
import com.example.demo.service.CertificadoAsistenciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CertificadoAsistenciaServiceImpl implements CertificadoAsistenciaService {
    private final CertificadoAsistenciaRepository repository;

    @Override
    public List<CertificadoAsistencia> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<CertificadoAsistencia> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public CertificadoAsistencia guardar(CertificadoAsistencia entidad) {
        return repository.save(entidad);
    }

    @Override
    public CertificadoAsistencia actualizar(CertificadoAsistencia entidad) {
        return repository.save(entidad);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
