package com.example.demo.repository;

import com.example.demo.entity.EstadoAsistenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoAsistenciaRepository extends JpaRepository<EstadoAsistenciaEntity, Integer> {
}