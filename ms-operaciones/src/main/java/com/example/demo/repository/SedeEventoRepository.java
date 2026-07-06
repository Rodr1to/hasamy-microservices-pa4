package com.example.demo.repository;

import com.example.demo.entity.SedeEvento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedeEventoRepository extends JpaRepository<SedeEvento, Integer> {
}
