package com.example.demo.repository;

import com.example.demo.entity.ModuloSistema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuloSistemaRepository extends JpaRepository<ModuloSistema, Integer> {
}