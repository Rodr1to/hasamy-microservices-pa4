package com.example.demo.repository;

import com.example.demo.entity.EstadoVueloEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoVueloRepository extends JpaRepository<EstadoVueloEntity, Integer> {
}
