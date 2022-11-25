package com.example.mascotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mascotas.entity.CategoriaAnimales;
import com.example.mascotas.repository.CategoriaAnimalesRepository;

@Service
public class CategoriaAnimalesServiceImpl implements CategoriaAnimalesService{

    @Autowired
    private CategoriaAnimalesRepository categoriaAnimalesRepository;

    @Override
    public List<CategoriaAnimales> listaCategoria() {
 
        return categoriaAnimalesRepository.findAll();
    }

    @Override
    public CategoriaAnimales guardCategoriaAnimales(CategoriaAnimales categoriaAnimales) {
        return categoriaAnimalesRepository.save(categoriaAnimales);
    }

    // @Override
    // public CategoriaAnimales encontrarCategoariaAnimales(Integer id) {
        
    //     return categoriaAnimalesRepository.findByCCategoria_Animales(id);
    // }
    
}
