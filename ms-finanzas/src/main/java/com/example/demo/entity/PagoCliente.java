package com.example.demo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pago_cliente")
public class PagoCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_pag")
    private Integer id;

    @Column(name = "mon_pag", nullable = false, precision = 10, scale = 2)
    private BigDecimal monto;

    @Column(name = "fec_pag")
    private LocalDateTime fecha;

    @Column(name = "num_operacion", length = 50)
    private String numeroOperacion;

    @Column(name = "cod_comp", nullable = false)
    private Integer codComprobante;

    @Column(name = "cod_metp", nullable = false)
    private Integer codMetodoPago;

    @Column(name = "cod_estp", nullable = false)
    private Integer codEstadoPago;

    @Column(name = "cod_ban")
    private Integer codBanco;

    //Autogenerado


    public PagoCliente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getNumeroOperacion() {
        return numeroOperacion;
    }

    public void setNumeroOperacion(String numeroOperacion) {
        this.numeroOperacion = numeroOperacion;
    }

    public Integer getCodComprobante() {
        return codComprobante;
    }

    public void setCodComprobante(Integer codComprobante) {
        this.codComprobante = codComprobante;
    }

    public Integer getCodMetodoPago() {
        return codMetodoPago;
    }

    public void setCodMetodoPago(Integer codMetodoPago) {
        this.codMetodoPago = codMetodoPago;
    }

    public Integer getCodEstadoPago() {
        return codEstadoPago;
    }

    public void setCodEstadoPago(Integer codEstadoPago) {
        this.codEstadoPago = codEstadoPago;
    }

    public Integer getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(Integer codBanco) {
        this.codBanco = codBanco;
    }
}
