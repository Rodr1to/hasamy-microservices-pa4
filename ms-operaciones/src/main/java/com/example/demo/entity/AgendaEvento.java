package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "agenda_evento")
public class AgendaEvento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_age")
    private Integer id;

    @Column(name = "hor_ini", nullable = false)
    private LocalTime horaInicio;

    @Column(name = "hor_fin", nullable = false)
    private LocalTime horaFin;

    @Column(name = "tema", nullable = false, columnDefinition = "TEXT")
    private String tema;

    @Column(name = "cod_eve", nullable = false)
    private Integer evento;

    @Column(name = "cod_pon", nullable = false)
    private Integer ponente;

    public AgendaEvento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Integer getEvento() {
        return evento;
    }

    public void setEvento(Integer evento) {
        this.evento = evento;
    }

    public Integer getPonente() {
        return ponente;
    }

    public void setPonente(Integer ponente) {
        this.ponente = ponente;
    }
}
