package com.example.demo.repository;

import com.example.demo.entity.ReservaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<ReservaEntity, Integer> {
}
