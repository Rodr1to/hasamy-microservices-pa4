package com.example.demo.service;

import com.example.demo.entity.BancoEntity;
import java.util.List;
import java.util.Optional;

public interface BancoService {
    List<BancoEntity> listarTodos();
    Optional<BancoEntity> buscarPorId(Integer id);
    BancoEntity guardar(BancoEntity entity);
    BancoEntity actualizar(BancoEntity entity);
    void eliminar(Integer id);
}
