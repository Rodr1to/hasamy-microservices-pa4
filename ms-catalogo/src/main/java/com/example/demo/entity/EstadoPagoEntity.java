package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "estado_pago")
public class EstadoPagoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_estp")
    private Integer id;

    @Column(name = "nom_estp", nullable = false, length = 40, unique = true)
    private String nombre;

    @Column(name = "est_estp", nullable = false)
    private Boolean estado = true;

    public EstadoPagoEntity() {
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
