package com.example.demo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "zona_evento")
public class ZonaEvento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_zon")
    private Integer id;

    @Column(name = "afo_max", nullable = false)
    private Integer aforoMaximo;

    @Column(name = "pre_zon", nullable = false, precision = 10, scale = 2)
    private BigDecimal precio;

    @Column(name = "cod_eve", nullable = false)
    private Integer evento;

    @Column(name = "cod_catz", nullable = false)
    private Integer categoriaZona;

    public ZonaEvento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAforoMaximo() {
        return aforoMaximo;
    }

    public void setAforoMaximo(Integer aforoMaximo) {
        this.aforoMaximo = aforoMaximo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getEvento() {
        return evento;
    }

    public void setEvento(Integer evento) {
        this.evento = evento;
    }

    public Integer getCategoriaZona() {
        return categoriaZona;
    }

    public void setCategoriaZona(Integer categoriaZona) {
        this.categoriaZona = categoriaZona;
    }
}
