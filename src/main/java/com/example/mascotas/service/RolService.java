package com.example.mascotas.service;

import java.util.List;

import com.example.mascotas.entity.Rol;

public interface RolService {
    public List<Rol> listarRol();
    public Rol agregarRol(Rol rol);
    // public Rol editarRol(Rol rol);
    //public Rol encontrarRol(Integer id);
}
