package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "vuelo_ponente")
public class VueloPonente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_vue")
    private Integer id;

    @Column(name = "num_vuelo", nullable = false, length = 20)
    private String numeroVuelo;

    @Column(name = "fec_llegada", nullable = false)
    private LocalDateTime fechaLlegada;

    @Column(name = "cod_pon", nullable = false)
    private Integer ponente;

    @Column(name = "cod_eve", nullable = false)
    private Integer evento;

    @Column(name = "cod_aero", nullable = false)
    private Integer aerolinea;

    @Column(name = "cod_estv", nullable = false)
    private Integer estadoVuelo;

    public VueloPonente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public LocalDateTime getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDateTime fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Integer getPonente() {
        return ponente;
    }

    public void setPonente(Integer ponente) {
        this.ponente = ponente;
    }

    public Integer getEvento() {
        return evento;
    }

    public void setEvento(Integer evento) {
        this.evento = evento;
    }

    public Integer getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Integer aerolinea) {
        this.aerolinea = aerolinea;
    }

    public Integer getEstadoVuelo() {
        return estadoVuelo;
    }

    public void setEstadoVuelo(Integer estadoVuelo) {
        this.estadoVuelo = estadoVuelo;
    }
}
