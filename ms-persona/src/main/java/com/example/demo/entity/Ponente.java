package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ponente")
public class Ponente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_pon")
    private Integer id;

    @Column(name = "nom_pon", nullable = false, length = 100)
    private String nombre;

    @Column(name = "esp_pon", nullable = false, length = 150)
    private String especialidad;

    @Column(name = "pasaporte", nullable = false, length = 20, unique = true)
    private String pasaporte;

    @Column(name = "cod_pais", nullable = false)
    private Integer codigoPais;

    public Ponente() {
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public Integer getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(Integer codigoPais) {
        this.codigoPais = codigoPais;
    }
}