package com.example.demo.repository;

import com.example.demo.entity.Ponente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PonenteRepository extends JpaRepository<Ponente, Integer> {
}
