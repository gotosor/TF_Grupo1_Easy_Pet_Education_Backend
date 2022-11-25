package com.example.mascotas.service;

import java.util.List;

import com.example.mascotas.dto.DtoArticulo;
import com.example.mascotas.dto.DtoArticuloR;



public interface ArticuloService {
    public List<DtoArticulo> listaArticulos();
    public List<DtoArticuloR> listArticulosC();
    public DtoArticulo agregarArticulos(DtoArticulo articulo);
  

}
