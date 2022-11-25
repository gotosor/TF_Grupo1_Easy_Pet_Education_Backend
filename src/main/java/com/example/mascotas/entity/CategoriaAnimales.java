package com.example.mascotas.entity;

import javax.persistence.*;

@Entity
@Table(name = "categoriaanimales")
public class CategoriaAnimales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CCategoria_Animales;

    private  String NCategoria_Animaes;

    public Integer getCCategoria_Animales() {
        return CCategoria_Animales;
    }

    public void setCCategoria_Animales(Integer CCategoria_Animales) {
        this.CCategoria_Animales = CCategoria_Animales;
    }

    public String getNCategoria_Animaes() {
        return NCategoria_Animaes;
    }

    public void setNCategoria_Animaes(String NCategoria_Animaes) {
        this.NCategoria_Animaes = NCategoria_Animaes;
    }

    public CategoriaAnimales() {
    }

    public CategoriaAnimales(Integer CCategoria_Animales, String NCategoria_Animaes) {
        this.CCategoria_Animales = CCategoria_Animales;
        this.NCategoria_Animaes = NCategoria_Animaes;
    }
}
