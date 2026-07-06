package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "estado_evento")
public class EstadoEventoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_este")
    private Integer id;

    @Column(name = "nom_este", nullable = false, length = 50, unique = true)
    private String nombre;

    @Column(name = "est_este", nullable = false)
    private Boolean estado = true;

    public EstadoEventoEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
