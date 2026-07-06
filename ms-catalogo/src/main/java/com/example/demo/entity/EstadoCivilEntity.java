package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "estado_civil")
public class EstadoCivilEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_estc")
    private Integer id;

    @Column(name = "nom_estc", nullable = false, length = 50, unique = true)
    private String nombre;

    @Column(name = "est_estc", nullable = false)
    private Boolean estado = true;

    public EstadoCivilEntity() {
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
