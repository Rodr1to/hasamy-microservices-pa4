package com.example.demo.repository;

import com.example.demo.entity.UsuarioRol;
import com.example.demo.entity.UsuarioRolId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRolRepository extends JpaRepository<UsuarioRol, UsuarioRolId> {
}