package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "metodo_pago")
public class MetodoPagoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_metp")
    private Integer id;

    @Column(name = "nom_metp", nullable = false, length = 255, unique = true)
    private String nombre;

    @Column(name = "est_metp", nullable = false)
    private Boolean estado = true;

    public MetodoPagoEntity() {
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