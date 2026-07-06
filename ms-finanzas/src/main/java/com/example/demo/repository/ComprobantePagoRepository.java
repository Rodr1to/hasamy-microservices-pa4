package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ComprobantePago;

@Repository
public interface ComprobantePagoRepository extends JpaRepository<ComprobantePago, Integer> {
}