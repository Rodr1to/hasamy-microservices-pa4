package com.example.demo.repository;

import com.example.demo.entity.KitLogistico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KitLogisticoRepository extends JpaRepository<KitLogistico, Integer> {
}
