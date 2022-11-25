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

import com.example.mascotas.entity.Seccion;
import com.example.mascotas.service.SeccionService;


@RestController
@RequestMapping("/seccion")
public class SeccionController {

    @Autowired
    private SeccionService seccionService;
    @GetMapping
    public List<Seccion> listarSeccion(){
        return seccionService.listarSeccion();
    }

    @PostMapping
    public Seccion guardarSeccion(@RequestBody Seccion seccion){
        return seccionService.guardarSeccion(seccion);
    }

    @PutMapping
    public Seccion actualizarSeccion(@RequestBody Seccion seccion){
        return seccionService.actualizarSeccion(seccion);
    }

    @GetMapping("/{id}")
    public Seccion encontrarSeccion(@PathVariable("id") Integer id){
        return seccionService.encontrarSeccion(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarSeccion(@PathVariable("id") Integer id){
         seccionService.eliminarSeccion(id);
    }


    
}
