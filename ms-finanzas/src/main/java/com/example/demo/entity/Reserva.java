package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_res")
    private Integer id;

    @Column(name = "fec_res")
    private LocalDateTime fecha;

    @Column(name = "tot_res", nullable = false, precision = 10, scale = 2)
    private BigDecimal total;

    @Column(name = "cod_cli", nullable = false)
    private Integer codCliente;

    @Column(name = "cod_emp", nullable = false)
    private Integer codEmpleado;

    @Column(name = "cod_estr", nullable = false)
    private Integer codEstadoReserva;

    //Autogenerado

    public Reserva() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public Integer getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(Integer codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public Integer getCodEstadoReserva() {
        return codEstadoReserva;
    }

    public void setCodEstadoReserva(Integer codEstadoReserva) {
        this.codEstadoReserva = codEstadoReserva;
    }
}
