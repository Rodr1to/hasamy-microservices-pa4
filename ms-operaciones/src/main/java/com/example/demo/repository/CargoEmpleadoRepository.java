package com.example.demo.repository;

import com.example.demo.entity.CargoEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoEmpleadoRepository extends JpaRepository<CargoEmpleado, Integer> {
}
