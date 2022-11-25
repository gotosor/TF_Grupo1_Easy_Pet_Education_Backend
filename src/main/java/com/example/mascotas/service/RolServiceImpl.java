package com.example.mascotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mascotas.entity.Rol;
import com.example.mascotas.repository.RolRepository;
@Service
public class RolServiceImpl implements RolService{

    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<Rol> listarRol() {
        return rolRepository.findAll();
    }

    @Override
    public Rol agregarRol(Rol rol) {
        
        return rolRepository.save(rol);
    }

    // @Override
    // public Rol editarRol(Rol rol) {
    //     Rol rol2 = encontrarRol(rol.getCId());
    //     rol2.setNNombre(rol.getNNombre());
    //     rol2.setNApellido(rol.getNApellido());
    //     rol2.setDFechaNacimiento(rol.getDFechaNacimiento());
    //     rol2.setCClave(rol.getCClave());
    //     return rolRepository.save(rol2);        
    // }

    // @Override
    // public Rol encontrarRol(Integer id) {
    //     return rolRepository.findByCId(id);
    // }

   
    
}
