package com.example.demo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "comprobante_pago")
public class Comprobante_Pago {

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
}
