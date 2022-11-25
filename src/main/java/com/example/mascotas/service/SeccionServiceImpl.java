package com.example.mascotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mascotas.entity.Seccion;
import com.example.mascotas.repository.SeccionRepository;
@Service
public class SeccionServiceImpl implements SeccionService{
    @Autowired
    private SeccionRepository seccionRepository;

    @Override
    public Seccion guardarSeccion(Seccion seccion) {
        
        return seccionRepository.save(seccion);
    }

    @Override
    public List<Seccion> listarSeccion() {
  
        return seccionRepository.findAll();
    }

    @Override
    public Seccion actualizarSeccion(Seccion seccion) {
        Seccion seccion2 = encontrarSeccion(seccion.getCSeccion());
        seccion2.setNSeccion(seccion.getNSeccion());
        return seccionRepository.save(seccion2);
    }

    @Override
    public void eliminarSeccion(int id) {
        seccionRepository.deleteById(id);
        
    }

    @Override
    public Seccion encontrarSeccion(int id) {
        
        return seccionRepository.findByCSeccion(id);
    }
    
}
