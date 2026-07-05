package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "permiso_rol")
@IdClass(PermisoRolId.class)
public class PermisoRol {

    @Id
    @Column(name = "cod_rol")
    private Integer rolId;

    @Id
    @Column(name = "cod_mod")
    private Integer moduloId;

    @Column(name = "lec_per")
    private Boolean lectura = false;

    @Column(name = "esc_per")
    private Boolean escritura = false;

    public PermisoRol() {}

    public Integer getRolId() { return rolId; }
    public void setRolId(Integer rolId) { this.rolId = rolId; }
    public Integer getModuloId() { return moduloId; }
    public void setModuloId(Integer moduloId) { this.moduloId = moduloId; }
    public Boolean getLectura() { return lectura; }
    public void setLectura(Boolean lectura) { this.lectura = lectura; }
    public Boolean getEscritura() { return escritura; }
    public void setEscritura(Boolean escritura) { this.escritura = escritura; }
}