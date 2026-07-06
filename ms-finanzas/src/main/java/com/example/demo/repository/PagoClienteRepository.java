package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PagoCliente;

@Repository
public interface PagoClienteRepository extends JpaRepository<PagoCliente, Integer> {
}