package com.example.mascotas.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "articuloanimal")
public class Articulo_Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Articulo_AnimalID;

    @ManyToOne
    @JoinColumn(name = "Animal_CAnimal")
    private Animal Animal_CAnimal;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Articulo_CArticulo")
    private Articulo Articulo_CArticulo;

    public Integer getArticulo_AnimalID() {
        return Articulo_AnimalID;
    }

    public void setArticulo_AnimalID(Integer articulo_AnimalID) {
        Articulo_AnimalID = articulo_AnimalID;
    }

    public Animal getAnimal_CAnimal() {
        return Animal_CAnimal;
    }

    public void setAnimal_CAnimal(Animal animal_CAnimal) {
        Animal_CAnimal = animal_CAnimal;
    }

    public Articulo getArticulo_CArticulo() {
        return Articulo_CArticulo;
    }

    public void setArticulo_CArticulo(Articulo articulo_CArticulo) {
        Articulo_CArticulo = articulo_CArticulo;
    }
}
