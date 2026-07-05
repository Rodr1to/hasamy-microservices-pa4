package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Salon_Belleza;

@Repository
public interface Salon_BellezaRepository extends JpaRepository<Salon_Belleza, Integer> {
}