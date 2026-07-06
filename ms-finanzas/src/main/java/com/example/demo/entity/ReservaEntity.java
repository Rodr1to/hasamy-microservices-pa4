package com.example.demo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "reserva")
public class ReservaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_res")
    private Integer id;

    @Column(name = "fec_res", nullable = false, updatable = false)
    private LocalDateTime fechaReserva = LocalDateTime.now();

    @Column(name = "tot_res", nullable = false, precision = 10, scale = 2)
    private BigDecimal total;

    // Llave foránea externa (apunta a ms-persona -> cliente)
    @Column(name = "cod_cli", nullable = false)
    private Integer cliente;

    // Llave foránea externa (apunta a ms-persona -> empleado)
    @Column(name = "cod_emp", nullable = false)
    private Integer empleado;

    // Llave foránea externa (apunta a ms-catalogo -> estado_reserva)
    @Column(name = "cod_estr", nullable = false)
    private Integer estadoReserva;

    public ReservaEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public Integer getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Integer empleado) {
        this.empleado = empleado;
    }

    public Integer getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(Integer estadoReserva) {
        this.estadoReserva = estadoReserva;
    }
}
