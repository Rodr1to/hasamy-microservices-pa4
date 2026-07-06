package com.example.demo.repository;

import com.example.demo.entity.AgendaEvento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaEventoRepository extends JpaRepository<AgendaEvento, Integer> {
}
