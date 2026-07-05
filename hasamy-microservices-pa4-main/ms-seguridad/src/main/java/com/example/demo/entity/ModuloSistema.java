package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "modulo_sistema")
public class ModuloSistema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_mod")
    private Integer id;

    @Column(name = "nom_mod", nullable = false, unique = true, length = 50)
    private String nombre;

    @Column(name = "est_mod", nullable = false)
    private Boolean estado = true;

    public ModuloSistema() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Boolean getEstado() { return estado; }
    public void setEstado(Boolean estado) { this.estado = estado; }
}