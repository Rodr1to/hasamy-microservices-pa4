package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "salon_belleza")
public class SalonBellezaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_sal")
    private Integer id;

    @Column(name = "ruc_sal", length = 20, unique = true)
    private String ruc;

    @Column(name = "nom_sal", nullable = false, length = 150)
    private String nombre;

    @Column(name = "dir_sal", columnDefinition = "TEXT")
    private String direccion;

    // Llave foránea externa (apunta a ms-catalogo -> distrito)
    @Column(name = "cod_dis", nullable = false)
    private Integer distrito;

    @Column(name = "est_sal", nullable = false)
    private Boolean estado = true;

    public SalonBellezaEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getDistrito() {
        return distrito;
    }

    public void setDistrito(Integer distrito) {
        this.distrito = distrito;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}