package com.example.mascotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mascotas.entity.Animal;
import com.example.mascotas.repository.AnimalRepository;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<Animal> listarAnimal() {
        return animalRepository.findAll();
    }

    @Override
    public Animal guardarAnimal(Animal animal) {
        
        return animalRepository.save(animal);
    }

    @Override
    public Animal actualizarAnimal(Animal animal) {
        Animal animal2 = encontrarAnimal(animal.getCAnimal());
        animal2.setNAnimal(animal.getNAnimal());
        animal2.setTDescripcion(animal.getTDescripcion());
        animal2.setImagenCmb(animal.getImagenCmb());
        animal2.setImagenAli(animal.getImagenAli());
        animal2.setImagenHig(animal.getImagenHig());
        animal2.setImagenAmb(animal.getImagenAmb());
        animal2.setImagenRep(animal.getImagenRep());
        animal2.setTextoAli(animal.getTextoAli());
        animal2.setTextoHig(animal.getTextoHig());
        animal2.setTextoAmb(animal.getTextoAmb());
        animal2.setTextoRep(animal.getTextoRep());
        return animalRepository.save(animal2);
    }

    @Override
    public void eliminarAnimal(int id) {
        animalRepository.deleteById(id);        
    }

    @Override
    public Animal encontrarAnimal(int id) {
        return animalRepository.findByCAnimal(id);
    }
    
}
