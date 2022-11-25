package com.example.mascotas.entity;



import javax.persistence.*;

@Entity
@Table(name = "fuentearticulo")
public class Fuente_Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Fuente_AritucloID;

    @ManyToOne
    @JoinColumn(name = "CFuente")
    private Fuente CFuente;

    @ManyToOne
    @JoinColumn(name = "CArticulo")
    private Articulo CArticulo;

    public Integer getFuente_AritucloID() {
        return Fuente_AritucloID;
    }

    public void setFuente_AritucloID(Integer fuente_AritucloID) {
        Fuente_AritucloID = fuente_AritucloID;
    }

    public Fuente getCFuente() {
        return CFuente;
    }

    public void setCFuente(Fuente CFuente) {
        this.CFuente = CFuente;
    }

    public Articulo getCArticulo() {
        return CArticulo;
    }

    public void setCArticulo(Articulo CArticulo) {
        this.CArticulo = CArticulo;
    }
}
