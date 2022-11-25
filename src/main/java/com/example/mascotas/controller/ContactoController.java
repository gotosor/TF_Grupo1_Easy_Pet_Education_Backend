package com.example.mascotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mascotas.entity.Contacto;
import com.example.mascotas.service.ContactoService;

@RestController
@RequestMapping("/contacto")
public class ContactoController {
    @Autowired
    private ContactoService contactoService;
    @GetMapping
    private List<Contacto> listarContacto(){
        return contactoService.listarContacto();
    }
    @PostMapping
    private Contacto guardarContacto(@RequestBody Contacto contacto){
        return contactoService.guardarContacto(contacto);
    }
}
