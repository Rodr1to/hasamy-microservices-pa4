package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Pago_Cliente;

@Repository
public interface Pago_ClienteRepository extends JpaRepository<Pago_Cliente, Integer> {
}