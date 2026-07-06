package com.example.demo.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "sede_evento")
public class SedeEvento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_sede")
    private Integer id;

    @Column(name = "nom_sede", nullable = false, length = 150, unique = true)
    private String nombre;

    @Column(name = "dir_sede", nullable = false, columnDefinition = "TEXT")
    private String direccion;

    @Column(name = "cod_dis", nullable = false)
    private Integer distrito;

    @Column(name = "est_sede", nullable = false)
    private Boolean estado;

    public SedeEvento() {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getDistrito() {
        return distrito;
    }

    public void setDistrito(Integer distrito) {
        this.distrito = distrito;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
