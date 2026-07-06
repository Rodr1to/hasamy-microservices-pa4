package com.example.demo.repository;

import com.example.demo.entity.EstadoReservaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoReservaRepository extends JpaRepository<EstadoReservaEntity, Integer> {
}
