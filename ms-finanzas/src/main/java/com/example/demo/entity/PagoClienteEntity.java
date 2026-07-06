package com.example.demo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pago_cliente")
public class PagoClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_pag")
    private Integer id;

    @Column(name = "mon_pag", nullable = false, precision = 10, scale = 2)
    private BigDecimal montoPago;

    @Column(name = "fec_pag", nullable = false, updatable = false)
    private LocalDateTime fechaPago = LocalDateTime.now();

    @Column(name = "num_operacion", length = 50)
    private String numOperacion;

    // Llave asociativa interna de microservicio
    @Column(name = "cod_comp", nullable = false)
    private Integer comprobante;

    // Llave foránea externa (apunta a ms-catalogo -> metodo_pago)
    @Column(name = "cod_metp", nullable = false)
    private Integer metodoPago;

    // Llave foránea externa (apunta a ms-catalogo -> estado_pago)
    @Column(name = "cod_estp", nullable = false)
    private Integer estadoPago;

    // Llave foránea externa (apunta a ms-catalogo -> banco)
    @Column(name = "cod_ban")
    private Integer banco;

    public PagoClienteEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(BigDecimal montoPago) {
        this.montoPago = montoPago;
    }

    public LocalDateTime getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDateTime fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getNumOperacion() {
        return numOperacion;
    }

    public void setNumOperacion(String numOperacion) {
        this.numOperacion = numOperacion;
    }

    public Integer getComprobante() {
        return comprobante;
    }

    public void setComprobante(Integer comprobante) {
        this.comprobante = comprobante;
    }

    public Integer getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(Integer metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Integer getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(Integer estadoPago) {
        this.estadoPago = estadoPago;
    }

    public Integer getBanco() {
        return banco;
    }

    public void setBanco(Integer banco) {
        this.banco = banco;
    }
}
