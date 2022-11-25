package com.example.mascotas.service;

import java.util.List;

import com.example.mascotas.entity.Administrador;


public interface AdministradorService {
    public List<Administrador> listarAdministrador();
    public Administrador agregarAdministrador(Administrador administrador);
    public List<Administrador> encontrarAdministrador(String username);
   
}
