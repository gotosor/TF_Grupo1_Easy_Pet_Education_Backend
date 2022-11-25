package com.example.mascotas.service;

import java.util.List;

import com.example.mascotas.entity.CategoriaAnimales;

public interface CategoriaAnimalesService {
    
    
    public List<CategoriaAnimales> listaCategoria();

    public CategoriaAnimales guardCategoriaAnimales(CategoriaAnimales categoriaAnimales);

   // public CategoriaAnimales encontrarCategoariaAnimales(Integer id);
}
