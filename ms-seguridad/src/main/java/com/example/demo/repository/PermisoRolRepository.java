package com.example.demo.repository;

import com.example.demo.entity.PermisoRol;
import com.example.demo.entity.PermisoRolId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermisoRolRepository extends JpaRepository<PermisoRol, PermisoRolId> {
}