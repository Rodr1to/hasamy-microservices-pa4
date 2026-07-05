package com.example.demo.repository;

import com.example.demo.entity.AuditoriaSistema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoriaSistemaRepository extends JpaRepository<AuditoriaSistema, Integer> {
}