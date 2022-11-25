package com.example.mascotas.service;

import java.util.List;

import com.example.mascotas.entity.Contacto;

public interface ContactoService {
    public Contacto guardarContacto(Contacto contacto);
    public List<Contacto> listarContacto();
}
