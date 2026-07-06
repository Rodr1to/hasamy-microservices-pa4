package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "control_puerta")
public class ControlPuerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_ctrl")
    private Integer id;

    @Column(name = "fec_scan")
    private LocalDateTime fechaEscaneo;

    @Column(name = "cod_tic", nullable = false, unique = true)
    private Integer ticket;

    @Column(name = "cod_emp", nullable = false)
    private Integer empleado;

    @Column(name = "cod_esta", nullable = false)
    private Integer estadoAsistencia;

    public ControlPuerta() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFechaEscaneo() {
        return fechaEscaneo;
    }

    public void setFechaEscaneo(LocalDateTime fechaEscaneo) {
        this.fechaEscaneo = fechaEscaneo;
    }

    public Integer getTicket() {
        return ticket;
    }

    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }

    public Integer getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Integer empleado) {
        this.empleado = empleado;
    }

    public Integer getEstadoAsistencia() {
        return estadoAsistencia;
    }

    public void setEstadoAsistencia(Integer estadoAsistencia) {
        this.estadoAsistencia = estadoAsistencia;
    }
}
