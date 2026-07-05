package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_pag")
    private Integer id;

    @Column(name = "mon_pag")
    private Double monto;

    @Column(name = "cod_metp")
    private Integer codMetodoPago; // Guardamos aca el ID que viene desde Catálogo

    public Pago() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Double getMonto() { return monto; }
    public void setMonto(Double monto) { this.monto = monto; }
    public Integer getCodMetodoPago() { return codMetodoPago; }
    public void setCodMetodoPago(Integer codMetodoPago) { this.codMetodoPago = codMetodoPago; }
}