package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "detalle_reserva")
public class Detalle_Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_detr")
    private Integer id;

    @Column(name = "can_tic", nullable = false)
    private Integer cantidadTickets;

    @Column(name = "sub_det", nullable = false, precision = 10, scale = 2)
    private BigDecimal subtotal;

    @Column(name = "cod_res", nullable = false)
    private Integer codReserva;

    @Column(name = "cod_zon", nullable = false)
    private Integer codZonaEvento;

    //Autogenerado


    public Detalle_Reserva() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidadTickets() {
        return cantidadTickets;
    }

    public void setCantidadTickets(Integer cantidadTickets) {
        this.cantidadTickets = cantidadTickets;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(Integer codReserva) {
        this.codReserva = codReserva;
    }

    public Integer getCodZonaEvento() {
        return codZonaEvento;
    }

    public void setCodZonaEvento(Integer codZonaEvento) {
        this.codZonaEvento = codZonaEvento;
    }
}
