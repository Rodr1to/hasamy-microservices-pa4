package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_eve")
    private Integer id;

    @Column(name = "nom_eve", nullable = false, length = 150)
    private String nombre;

    @Column(name = "fec_ini", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fec_fin", nullable = false)
    private LocalDate fechaFin;

    @Column(name = "cod_sede", nullable = false)
    private Integer sede;

    @Column(name = "cod_este", nullable = false)
    private Integer estadoEvento;

    public Evento() {
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

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getSede() {
        return sede;
    }

    public void setSede(Integer sede) {
        this.sede = sede;
    }

    public Integer getEstadoEvento() {
        return estadoEvento;
    }

    public void setEstadoEvento(Integer estadoEvento) {
        this.estadoEvento = estadoEvento;
    }
}
