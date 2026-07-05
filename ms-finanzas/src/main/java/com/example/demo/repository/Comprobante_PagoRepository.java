package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Comprobante_Pago;

@Repository
public interface Comprobante_PagoRepository extends JpaRepository<Comprobante_Pago, Integer> {
}