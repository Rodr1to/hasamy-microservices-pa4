package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_usu")
    private Integer id;

    @Column(name = "nom_usu", nullable = false, unique = true, length = 50)
    private String nombreUsuario;

    @Column(name = "cla_usu", nullable = false, length = 255)
    private String clave;

    @Column(name = "cod_emp", nullable = false)
    private Integer empleadoId; // Llave foránea manejada como Integer

    @Column(name = "est_usu", nullable = false)
    private Boolean estado = true;

    public Usuario() {}

    // Getters y Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }
    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }
    public Integer getEmpleadoId() { return empleadoId; }
    public void setEmpleadoId(Integer empleadoId) { this.empleadoId = empleadoId; }
    public Boolean getEstado() { return estado; }
    public void setEstado(Boolean estado) { this.estado = estado; }
}