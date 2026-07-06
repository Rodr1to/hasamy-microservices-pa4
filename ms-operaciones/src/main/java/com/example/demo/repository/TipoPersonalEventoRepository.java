package com.example.demo.repository;

import com.example.demo.entity.TipoPersonalEvento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPersonalEventoRepository extends JpaRepository<TipoPersonalEvento, Integer> {
}
