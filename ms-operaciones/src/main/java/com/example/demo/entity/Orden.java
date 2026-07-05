package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orden")
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_ord")
    private Integer id;

    @Column(name = "desc_ord")
    private String descripcion;

    @Column(name = "cod_cli")
    private Integer codCliente; // Guardamos el ID del cliente que hizo la orden

    public Orden() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public Integer getCodCliente() { return codCliente; }
    public void setCodCliente(Integer codCliente) { this.codCliente = codCliente; }
}