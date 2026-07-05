package com.example.demo.client;

public class ClienteDTO {
    private Integer id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String dni;

    public ClienteDTO() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellidoPaterno() { return apellidoPaterno; }
    public void setApellidoPaterno(String apellidoPaterno) { this.apellidoPaterno = apellidoPaterno; }
    public String getApellidoMaterno() { return apellidoMaterno; }
    public void setApellidoMaterno(String apellidoMaterno) { this.apellidoMaterno = apellidoMaterno; }
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
}