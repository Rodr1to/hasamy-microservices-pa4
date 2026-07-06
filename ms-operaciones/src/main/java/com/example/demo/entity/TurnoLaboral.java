package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "turno_laboral")
public class TurnoLaboral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_tur")
    private Integer id;

    @Column(name = "nom_tur", nullable = false, length = 40, unique = true)
    private String nombre;

    @Column(name = "ini_tur", nullable = false)
    private LocalTime horaInicio;

    @Column(name = "fin_tur", nullable = false)
    private LocalTime horaFin;

    @Column(name = "est_tur", nullable = false)
    private Boolean estado;

    public TurnoLaboral() {
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

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
