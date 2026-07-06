package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sexo")
public class SexoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_sex")
    private Integer id;

    @Column(name = "nom_sex", nullable = false, length = 30, unique = true)
    private String nombre;

    @Column(name = "est_sex", nullable = false)
    private Boolean estado = true;

    public SexoEntity() {
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
