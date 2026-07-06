package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "incidencia_evento")
public class IncidenciaEvento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_ince")
    private Integer id;

    @Column(name = "des_ince", nullable = false, columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "fec_ince")
    private LocalDateTime fecha;

    @Column(name = "cod_eve", nullable = false)
    private Integer evento;

    @Column(name = "cod_emp", nullable = false)
    private Integer empleado;

    public IncidenciaEvento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Integer getEvento() {
        return evento;
    }

    public void setEvento(Integer evento) {
        this.evento = evento;
    }

    public Integer getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Integer empleado) {
        this.empleado = empleado;
    }
}
