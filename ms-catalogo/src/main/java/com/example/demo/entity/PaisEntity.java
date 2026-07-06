package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pais")
public class PaisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_pais")
    private Integer id;

    @Column(name = "nom_pais", nullable = false, length = 100, unique = true)
    private String nombre;

    @Column(name = "est_pais", nullable = false)
    private Boolean estado = true;

    public PaisEntity() {
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
