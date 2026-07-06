package com.example.demo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "comprobante_pago")
public class ComprobantePagoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_comp")
    private Integer id;

    @Column(name = "num_comp", nullable = false, length = 50, unique = true)
    private String nroComprobante;

    @Column(name = "fec_comp", nullable = false, updatable = false)
    private LocalDateTime fechaComprobante = LocalDateTime.now();

    @Column(name = "tot_comp", nullable = false, precision = 10, scale = 2)
    private BigDecimal totalComprobante;

    // Llave asociativa interna de microservicio
    @Column(name = "cod_res", nullable = false)
    private Integer reserva;

    // Llave foránea externa (apunta a ms-catalogo -> tipo_comprobante)
    @Column(name = "cod_tipc", nullable = false)
    private Integer tipoComprobante;

    public ComprobantePagoEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNroComprobante() {
        return nroComprobante;
    }

    public void setNroComprobante(String nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    public LocalDateTime getFechaComprobante() {
        return fechaComprobante;
    }

    public void setFechaComprobante(LocalDateTime fechaComprobante) {
        this.fechaComprobante = fechaComprobante;
    }

    public BigDecimal getTotalComprobante() {
        return totalComprobante;
    }

    public void setTotalComprobante(BigDecimal totalComprobante) {
        this.totalComprobante = totalComprobante;
    }

    public Integer getReserva() {
        return reserva;
    }

    public void setReserva(Integer reserva) {
        this.reserva = reserva;
    }

    public Integer getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(Integer tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }
}
