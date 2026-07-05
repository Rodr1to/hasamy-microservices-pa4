package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_emp")
    private Integer id;

    @Column(name = "nom_emp", nullable = false, length = 50)
    private String nombre;

    @Column(name = "apep_emp", nullable = false, length = 40)
    private String apellidoPaterno;

    @Column(name = "apem_emp", nullable = false, length = 40)
    private String apellidoMaterno;

    @Column(name = "num_doc", nullable = false, length = 20, unique = true)
    private String nroDocumento;

    @Column(name = "cod_tipd", nullable = false)
    private Integer tipoDoc;

    @Column(name = "cod_sex", nullable = false)
    private Integer sexo;

    @Column(name = "cod_estc", nullable = false)
    private Integer estadoCivil;

    @Column(name = "cod_car", nullable = false)
    private Integer cargo;

    @Column(name = "cod_are", nullable = false)
    private Integer area;

    @Column(name = "est_emp", nullable = false)
    private Boolean estado = true;

    // Constructores
    public Empleado() {
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public Integer getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(Integer tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public Integer getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(Integer estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Integer getCargo() {
        return cargo;
    }

    public void setCargo(Integer cargo) {
        this.cargo = cargo;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
