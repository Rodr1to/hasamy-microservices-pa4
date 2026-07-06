package com.example.demo.repository;

import com.example.demo.entity.HorarioEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioEmpleadoRepository extends JpaRepository<HorarioEmpleado, Integer> {
}
