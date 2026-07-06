package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.SalonBelleza;

@Repository
public interface SalonBellezaRepository extends JpaRepository<SalonBelleza, Integer> {
}