package com.example.mascotas.entity;

import javax.persistence.*;

@Entity
@Table(name = "seccion")
public class Seccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CSeccion;
    private  String NSeccion;

    public Integer getCSeccion() {
        return CSeccion;
    }

    public void setCSeccion(Integer CSeccion) {
        this.CSeccion = CSeccion;
    }

    public String getNSeccion() {
        return NSeccion;
    }

    public void setNSeccion(String NSeccion) {
        this.NSeccion = NSeccion;
    }

    public Seccion() {
    }

    public Seccion(Integer CSeccion, String NSeccion) {
        this.CSeccion = CSeccion;
        this.NSeccion = NSeccion;
    }
}
