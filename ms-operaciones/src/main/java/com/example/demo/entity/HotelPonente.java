package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "hotel_ponente")
public class HotelPonente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_hot")
    private Integer id;

    @Column(name = "nom_hot", nullable = false, length = 100)
    private String nombreHotel;

    @Column(name = "fec_checkin", nullable = false)
    private LocalDateTime fechaCheckin;

    @Column(name = "fec_checkout", nullable = false)
    private LocalDateTime fechaCheckout;

    @Column(name = "cod_pon", nullable = false)
    private Integer ponente;

    @Column(name = "cod_eve", nullable = false)
    private Integer evento;

    @Column(name = "cod_esth", nullable = false)
    private Integer estadoHotel;

    public HotelPonente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public LocalDateTime getFechaCheckin() {
        return fechaCheckin;
    }

    public void setFechaCheckin(LocalDateTime fechaCheckin) {
        this.fechaCheckin = fechaCheckin;
    }

    public LocalDateTime getFechaCheckout() {
        return fechaCheckout;
    }

    public void setFechaCheckout(LocalDateTime fechaCheckout) {
        this.fechaCheckout = fechaCheckout;
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

    public Integer getEstadoHotel() {
        return estadoHotel;
    }

    public void setEstadoHotel(Integer estadoHotel) {
        this.estadoHotel = estadoHotel;
    }
}
