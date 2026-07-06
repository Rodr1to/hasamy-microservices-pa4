package com.example.demo.repository;

import com.example.demo.entity.IncidenciaEvento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidenciaEventoRepository extends JpaRepository<IncidenciaEvento, Integer> {
}
