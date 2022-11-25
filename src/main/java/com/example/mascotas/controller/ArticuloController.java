package com.example.mascotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mascotas.dto.DtoArticulo;
import com.example.mascotas.dto.DtoArticuloR;
import com.example.mascotas.service.ArticuloService;



import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/articulo")
public class ArticuloController {

    @Autowired
    private ArticuloService articuloService;

    @PostMapping
    public DtoArticulo agregArticulo(@RequestBody DtoArticulo dtoArticulo){
        return articuloService.agregarArticulos(dtoArticulo);
    }

    @GetMapping("/opcion1")
    public List<DtoArticulo> listarArticulo() {
        return articuloService.listaArticulos();
    }

    @GetMapping("/opcion2")
    public List<DtoArticuloR> listarArticuloDtos(){
        return articuloService.listArticulosC();
    }

    
    
    
    
}
