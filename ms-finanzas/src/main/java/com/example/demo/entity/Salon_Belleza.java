package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "salon_belleza")
public class Salon_Belleza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_sal")
    private Integer id;

    @Column(name = "ruc_sal", unique = true, length = 20)
    private String ruc;

    @Column(name = "nom_sal", nullable = false, length = 150)
    private String nombre;

    @Column(name = "dir_sal")
    private String direccion;

    @Column(name = "cod_dis", nullable = false)
    private Integer codDistrito; // Solo almacenamos el ID del distrito

    @Column(name = "est_sal", nullable = false)
    private Boolean estado;


    //Autogenerado
    public Salon_Belleza() {}

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

    public Integer getCodDistrito() {
        return codDistrito;
    }

    public void setCodDistrito(Integer codDistrito) {
        this.codDistrito = codDistrito;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
