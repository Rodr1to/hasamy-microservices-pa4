package com.example.demo.repository;

import com.example.demo.entity.PaisEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepository extends JpaRepository<PaisEntity, Integer> {
}
