package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Detalle_Reserva;

@Repository
public interface Detalle_ReservaRepository extends JpaRepository<Detalle_Reserva, Integer> {
}