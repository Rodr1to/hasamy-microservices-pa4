package com.example.demo.repository;

import com.example.demo.entity.DetalleReservaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleReservaRepository extends JpaRepository<DetalleReservaEntity, Integer> {
}
