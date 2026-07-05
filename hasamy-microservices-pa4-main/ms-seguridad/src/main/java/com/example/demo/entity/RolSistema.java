package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "rol_sistema")
public class RolSistema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_rol")
    private Integer id;

    @Column(name = "nom_rol", nullable = false, unique = true, length = 40)
    private String nombre;

    @Column(name = "est_rol", nullable = false)
    private Boolean estado = true;

    public RolSistema() {}

    // Getters y Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Boolean getEstado() { return estado; }
    public void setEstado(Boolean estado) { this.estado = estado; }
}