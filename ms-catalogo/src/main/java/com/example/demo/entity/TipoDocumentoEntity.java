package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_documento")
public class TipoDocumentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_tipd")
    private Integer id;

    @Column(name = "nom_tipd", nullable = false, length = 30, unique = true)
    private String nombre;

    @Column(name = "est_tipd", nullable = false)
    private Boolean estado = true;

    public TipoDocumentoEntity() {
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
