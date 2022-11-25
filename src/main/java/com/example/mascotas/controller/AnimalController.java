package com.example.mascotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mascotas.entity.Animal;
import com.example.mascotas.entity.CategoriaAnimales;
import com.example.mascotas.service.AnimalService;
import com.example.mascotas.service.CategoriaAnimalesService;

@RestController
@RequestMapping("/animal")
public class AnimalController {
    
    @Autowired
    private AnimalService animalService;

    @Autowired
    private CategoriaAnimalesService categoriaAnimalesService;


    @GetMapping
    public List<Animal> listarAnimals(){
        return animalService.listarAnimal();
    }



   @PostMapping
   public Animal guardarAnimales(@RequestBody Animal animal){
        return animalService.guardarAnimal(animal);
   } 

   @PutMapping
   public Animal actualizarAnimal(@RequestBody Animal animal){
        return animalService.actualizarAnimal(animal);
   }

   @DeleteMapping("/{id}")
   public void eliminarAnimal(@PathVariable("id") Integer id){
        animalService.eliminarAnimal(id);
   }
   @GetMapping("/{id}")
   public Animal encontrarAnimal(@PathVariable("id") Integer id){
        return animalService.encontrarAnimal(id);
   }

   


    @GetMapping("/categoria")
    public List<CategoriaAnimales> listarCategorias(){
        return categoriaAnimalesService.listaCategoria();
    }

    @PostMapping("/categoria")
    public CategoriaAnimales guardarCategoriaAnimales(@RequestBody CategoriaAnimales categoriaAnimales){
        return categoriaAnimalesService.guardCategoriaAnimales(categoriaAnimales);
    }

    // @GetMapping("/categoria/{id}")
    // public CategoriaAnimales encontrarCategoriaAnimales(@PathVariable("id") Integer id){
    //     return categoriaAnimalesService.encontrarCategoariaAnimales(id);
    // }




}
