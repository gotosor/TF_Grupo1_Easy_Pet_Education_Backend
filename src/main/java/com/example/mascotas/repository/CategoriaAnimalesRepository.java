package com.example.mascotas.repository;

import com.example.mascotas.entity.CategoriaAnimales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaAnimalesRepository extends JpaRepository<CategoriaAnimales, Integer> {

   // public CategoriaAnimales findByCCategoria_Animales(Integer CCategoria_Animales);
   
}
