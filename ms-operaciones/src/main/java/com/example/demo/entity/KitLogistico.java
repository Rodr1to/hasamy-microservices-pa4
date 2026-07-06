package com.example.demo.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "kit_logistico")
public class KitLogistico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_kit")
    private Integer id;

    @Column(name = "con_kit", nullable = false, columnDefinition = "TEXT")
    private String contenido;

    @Column(name = "entregado", nullable = false)
    private Boolean entregado;

    @Column(name = "cod_tic", nullable = false, unique = true)
    private Integer ticket;

    public KitLogistico() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Boolean getEntregado() {
        return entregado;
    }

    public void setEntregado(Boolean entregado) {
        this.entregado = entregado;
    }

    public Integer getTicket() {
        return ticket;
    }

    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }
}
