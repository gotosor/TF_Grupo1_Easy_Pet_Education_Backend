package com.example.mascotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mascotas.entity.Administrador;

import com.example.mascotas.repository.AdministradorRepository;
@Service
public class AdministradorServiceImpl implements AdministradorService {

    @Autowired
    private AdministradorRepository administradorRepository;

    @Override
    public List<Administrador> listarAdministrador() {

        return administradorRepository.findAll();
    }

    @Override
    public Administrador agregarAdministrador(Administrador administrador) {
        
        return administradorRepository.save(administrador);
    }

    @Override
    public List<Administrador> encontrarAdministrador(String username) {
        
        return administradorRepository.listaAdministradorPorCorreo(username);
    }

    // @Override
    // public List<Administrador> listByRol(Rol rol) {
        
    //     return administradorRepository.findByRol_CId(rol);
    // }
    
}
