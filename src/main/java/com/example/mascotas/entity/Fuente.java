package com.example.mascotas.entity;

import javax.persistence.*;

@Entity
@Table(name = "fuente")
public class Fuente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CFuente;
    private String NFuente;
    private String DFechaPublicacion;
    private int NAutor;
    private String TContenido;

    public Integer getCFuente() {
        return CFuente;
    }

    public void setCFuente(Integer CFuente) {
        this.CFuente = CFuente;
    }

    public String getNFuente() {
        return NFuente;
    }

    public void setNFuente(String NFuente) {
        this.NFuente = NFuente;
    }

    public String getDFechaPublicacion() {
        return DFechaPublicacion;
    }

    public void setDFechaPublicacion(String DFechaPublicacion) {
        this.DFechaPublicacion = DFechaPublicacion;
    }

    public int getNAutor() {
        return NAutor;
    }

    public void setNAutor(int NAutor) {
        this.NAutor = NAutor;
    }

    public String getTContenido() {
        return TContenido;
    }

    public void setTContenido(String TContenido) {
        this.TContenido = TContenido;
    }

    public Fuente(Integer CFuente, String NFuente, String DFechaPublicacion, int NAutor, String TContenido) {
        this.CFuente = CFuente;
        this.NFuente = NFuente;
        this.DFechaPublicacion = DFechaPublicacion;
        this.NAutor = NAutor;
        this.TContenido = TContenido;
    }

    public Fuente() {
    }
}
