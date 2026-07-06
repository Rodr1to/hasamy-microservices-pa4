package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "aerolinea")
public class AerolineaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_aero")
    private Integer id;

    @Column(name = "nom_aero", nullable = false, length = 100, unique = true)
    private String nombre;

    @Column(name = "est_aero", nullable = false)
    private Boolean estado = true;

    public AerolineaEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}