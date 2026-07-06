package com.example.demo.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "ticket_ingreso")
public class TicketIngreso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_tic")
    private Integer id;

    @Column(name = "codigo_qr", nullable = false, length = 100, unique = true)
    private String codigoQr;

    @Column(name = "est_tic", nullable = false)
    private Boolean estado;

    @Column(name = "cod_detr", nullable = false)
    private Integer detalleReserva;

    @Column(name = "cod_cli", nullable = false)
    private Integer cliente;

    public TicketIngreso() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoQr() {
        return codigoQr;
    }

    public void setCodigoQr(String codigoQr) {
        this.codigoQr = codigoQr;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getDetalleReserva() {
        return detalleReserva;
    }

    public void setDetalleReserva(Integer detalleReserva) {
        this.detalleReserva = detalleReserva;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }
}
