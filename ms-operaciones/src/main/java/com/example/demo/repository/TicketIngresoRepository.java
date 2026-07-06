package com.example.demo.repository;

import com.example.demo.entity.TicketIngreso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketIngresoRepository extends JpaRepository<TicketIngreso, Integer> {
}
