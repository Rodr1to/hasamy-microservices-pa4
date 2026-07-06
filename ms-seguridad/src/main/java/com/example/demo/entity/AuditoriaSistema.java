package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "auditoria_sistema")
public class AuditoriaSistema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_aud")
    private Integer id;

    @Column(name = "acc_aud", nullable = false, columnDefinition = "TEXT")
    private String accion;

    @Column(name = "fec_aud", insertable = false, updatable = false)
    private LocalDateTime fechaAuditoria;

    @Column(name = "ip_aud", nullable = false, length = 45)
    private String ip;

    @Column(name = "cod_usu", nullable = false)
    private Integer usuarioId;

    @Column(name = "cod_mod", nullable = false)
    private Integer moduloId;

    public AuditoriaSistema() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getAccion() { return accion; }
    public void setAccion(String accion) { this.accion = accion; }
    public LocalDateTime getFechaAuditoria() { return fechaAuditoria; }
    public void setFechaAuditoria(LocalDateTime fechaAuditoria) { this.fechaAuditoria = fechaAuditoria; }
    public String getIp() { return ip; }
    public void setIp(String ip) { this.ip = ip; }
    public Integer getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Integer usuarioId) { this.usuarioId = usuarioId; }
    public Integer getModuloId() { return moduloId; }
    public void setModuloId(Integer moduloId) { this.moduloId = moduloId; }
}