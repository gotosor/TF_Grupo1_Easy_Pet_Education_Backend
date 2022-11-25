package com.example.mascotas.repository;
import com.example.mascotas.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    public Animal findByCAnimal(int CAnimal);
}
