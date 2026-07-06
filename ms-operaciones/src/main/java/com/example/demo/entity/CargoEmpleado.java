package com.example.demo.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "cargo_empleado")
public class CargoEmpleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_car")
    private Integer id;

    @Column(name = "nom_car", nullable = false, length = 50, unique = true)
    private String nombre;

    @Column(name = "est_car", nullable = false)
    private Boolean estado;

    public CargoEmpleado() {
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
