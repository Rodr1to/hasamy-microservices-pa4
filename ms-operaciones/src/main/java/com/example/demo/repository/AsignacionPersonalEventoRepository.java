package com.example.demo.repository;

import com.example.demo.entity.AsignacionPersonalEvento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignacionPersonalEventoRepository extends JpaRepository<AsignacionPersonalEvento, Integer> {
}
