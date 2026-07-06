package com.example.demo.repository;

import com.example.demo.entity.AreaTrabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaTrabajoRepository extends JpaRepository<AreaTrabajo, Integer> {
}
