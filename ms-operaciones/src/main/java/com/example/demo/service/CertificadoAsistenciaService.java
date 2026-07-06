package com.example.demo.service;

import com.example.demo.entity.CertificadoAsistencia;
import java.util.List;
import java.util.Optional;

public interface CertificadoAsistenciaService {
    List<CertificadoAsistencia> listarTodos();
    Optional<CertificadoAsistencia> buscarPorId(Integer id);
    CertificadoAsistencia guardar(CertificadoAsistencia entidad);
    CertificadoAsistencia actualizar(CertificadoAsistencia entidad);
    void eliminar(Integer id);
}
