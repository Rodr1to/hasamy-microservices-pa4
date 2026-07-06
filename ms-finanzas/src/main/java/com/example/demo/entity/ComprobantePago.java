package com.example.demo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "comprobante_pago")
public class ComprobantePago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_comp")
    private Integer id;

    @Column(name = "num_comp", nullable = false, unique = true, length = 50)
    private String numeroComprobante;

    @Column(name = "fec_comp")
    private LocalDateTime fecha;

    @Column(name = "tot_comp", nullable = false, precision = 10, scale = 2)
    private BigDecimal total;

    @Column(name = "cod_res", nullable = false)
    private Integer codReserva;

    @Column(name = "cod_tipc", nullable = false)
    private Integer codTipoComprobante;

    //Autogenerado

    public ComprobantePago() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Integer getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(Integer codReserva) {
        this.codReserva = codReserva;
    }

    public Integer getCodTipoComprobante() {
        return codTipoComprobante;
    }

    public void setCodTipoComprobante(Integer codTipoComprobante) {
        this.codTipoComprobante = codTipoComprobante;
    }
}
