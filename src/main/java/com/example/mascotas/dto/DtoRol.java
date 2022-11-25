package com.example.mascotas.dto;

public class DtoRol {

    private Integer id;
    private  Integer idEntidad;
    private String correo;
    private String dfechaNacimiento;
    private String cclave;
    private String nnombre;
    private String napellido;
    private String rol;

    public String getRol(){
        return rol;
    }

    public Integer getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(Integer idEntidad) {
        this.idEntidad = idEntidad;
    }

    public void setRol(String rol){
        this.rol = rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDfechaNacimiento() {
        return dfechaNacimiento;
    }

    public void setDfechaNacimiento(String dfechaNacimiento) {
        this.dfechaNacimiento = dfechaNacimiento;
    }

    public String getCclave() {
        return cclave;
    }

    public void setCclave(String cclave) {
        this.cclave = cclave;
    }

    public String getNnombre() {
        return nnombre;
    }

    public void setNnombre(String nnombre) {
        this.nnombre = nnombre;
    }

    public String getNapellido() {
        return napellido;
    }

    public void setNapellido(String napellido) {
        this.napellido = napellido;
    }
}
