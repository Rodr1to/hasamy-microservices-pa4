package com.example.demo.repository;

import com.example.demo.entity.TurnoLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnoLaboralRepository extends JpaRepository<TurnoLaboral, Integer> {
}
