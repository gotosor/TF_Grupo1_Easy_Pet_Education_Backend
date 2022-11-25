package com.example.mascotas.entity;

import javax.persistence.*;

@Entity
@Table(name="rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CId;
    private String NNombre;
    private String NApellido;
    private String DFechaNacimiento;
    private String CClave;

    public Integer getCId() {
        return CId;
    }

    public void setCId(Integer CId) {
        this.CId = CId;
    }

    public String getNNombre() {
        return NNombre;
    }

    public void setNNombre(String NNombre) {
        this.NNombre = NNombre;
    }

    public String getNApellido() {
        return NApellido;
    }

    public void setNApellido(String NApellido) {
        this.NApellido = NApellido;
    }

    public String getDFechaNacimiento() {
        return DFechaNacimiento;
    }

    public void setDFechaNacimiento(String DFechaNacimiento) {
        this.DFechaNacimiento = DFechaNacimiento;
    }

    public String getCClave() {
        return CClave;
    }

    public void setCClave(String CClave) {
        this.CClave = CClave;
    }

    public Rol() {
    }

    public Rol(Integer CId, String NNombre, String NApellido, String DFechaNacimiento, String CClave) {
        this.CId = CId;
        this.NNombre = NNombre;
        this.NApellido = NApellido;
        this.DFechaNacimiento = DFechaNacimiento;
        this.CClave = CClave;
    }
}
