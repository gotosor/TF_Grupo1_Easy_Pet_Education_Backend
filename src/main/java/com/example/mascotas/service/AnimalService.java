package com.example.mascotas.service;

import java.util.List;

import com.example.mascotas.entity.Animal;

public interface AnimalService {
    public List<Animal> listarAnimal();
    public Animal guardarAnimal(Animal animal);
    public Animal actualizarAnimal(Animal animal);
    public void eliminarAnimal(int id);
    public Animal encontrarAnimal(int id);
}
