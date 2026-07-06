package com.example.demo.repository;

import com.example.demo.entity.AsistenciaEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsistenciaEmpleadoRepository extends JpaRepository<AsistenciaEmpleado, Integer> {
}
