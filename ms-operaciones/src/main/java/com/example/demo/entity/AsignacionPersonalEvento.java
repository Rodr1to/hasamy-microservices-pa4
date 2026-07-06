package com.example.demo.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "asignacion_personal_evento")
public class AsignacionPersonalEvento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_asig")
    private Integer id;

    @Column(name = "cod_emp", nullable = false)
    private Integer empleado;

    @Column(name = "cod_eve", nullable = false)
    private Integer evento;

    @Column(name = "cod_tipp", nullable = false)
    private Integer tipoPersonal;

    public AsignacionPersonalEvento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Integer empleado) {
        this.empleado = empleado;
    }

    public Integer getEvento() {
        return evento;
    }

    public void setEvento(Integer evento) {
        this.evento = evento;
    }

    public Integer getTipoPersonal() {
        return tipoPersonal;
    }

    public void setTipoPersonal(Integer tipoPersonal) {
        this.tipoPersonal = tipoPersonal;
    }
}
