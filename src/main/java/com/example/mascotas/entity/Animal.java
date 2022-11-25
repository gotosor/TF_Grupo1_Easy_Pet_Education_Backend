package com.example.mascotas.entity;


import javax.persistence.*;

@Entity
@Table(name = "animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CAnimal;
    private String NAnimal;
    private String TDescripcion;
    private String imagenCmb;
    private String imagenAli;
    private String imagenHig;
    private String imagenAmb;
    private String imagenRep;
    private String textoAli;
    private String textoHig;
    private String textoAmb;
    private String textoRep;
    
    @ManyToOne
    @JoinColumn(name = "CCategoria_Animales")
    private CategoriaAnimales CCategoria_Animales;

    public Integer getCAnimal() {
        return CAnimal;
    }

    public void setCAnimal(Integer CAnimal) {
        this.CAnimal = CAnimal;
    }

    public String getNAnimal() {
        return NAnimal;
    }

    public void setNAnimal(String NAnimal) {
        this.NAnimal = NAnimal;
    }

    public String getTDescripcion() {
        return TDescripcion;
    }

    public void setTDescripcion(String TDescripcion) {
        this.TDescripcion = TDescripcion;
    }

    public String getImagenCmb() {
        return imagenCmb;
    }

    public void setImagenCmb(String imagenCmb) {
        this.imagenCmb = imagenCmb;
    }

    public String getImagenAli() {
        return imagenAli;
    }

    public void setImagenAli(String imagenAli) {
        this.imagenAli = imagenAli;
    }

    public String getImagenHig() {
        return imagenHig;
    }

    public void setImagenHig(String imagenHig) {
        this.imagenHig = imagenHig;
    }

    public String getImagenAmb() {
        return imagenAmb;
    }

    public void setImagenAmb(String imagenAmb) {
        this.imagenAmb = imagenAmb;
    }

    public String getImagenRep() {
        return imagenRep;
    }

    public void setImagenRep(String imagenRep) {
        this.imagenRep = imagenRep;
    }

    public String getTextoAli() {
        return textoAli;
    }

    public void setTextoAli(String textoAli) {
        this.textoAli = textoAli;
    }

    public String getTextoHig() {
        return textoHig;
    }

    public void setTextoHig(String textoHig) {
        this.textoHig = textoHig;
    }

    public String getTextoAmb() {
        return textoAmb;
    }

    public void setTextoAmb(String textoAmb) {
        this.textoAmb = textoAmb;
    }

    public String getTextoRep() {
        return textoRep;
    }

    public void setTextoRep(String textoRep) {
        this.textoRep = textoRep;
    }

    public CategoriaAnimales getCCategoria_Animales() {
        return CCategoria_Animales;
    }

    public void setCCategoria_Animales(CategoriaAnimales CCategoria_Animales) {
        this.CCategoria_Animales = CCategoria_Animales;
    }

    public Animal() {
    }


}
