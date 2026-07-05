package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario_rol")
@IdClass(UsuarioRolId.class)
public class UsuarioRol {

    @Id
    @Column(name = "cod_usu")
    private Integer usuarioId;

    @Id
    @Column(name = "cod_rol")
    private Integer rolId;

    public UsuarioRol() {}

    public Integer getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Integer usuarioId) { this.usuarioId = usuarioId; }
    public Integer getRolId() { return rolId; }
    public void setRolId(Integer rolId) { this.rolId = rolId; }
}