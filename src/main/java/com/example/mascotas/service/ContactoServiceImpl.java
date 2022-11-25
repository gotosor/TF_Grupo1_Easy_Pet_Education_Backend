package com.example.mascotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mascotas.entity.Contacto;
import com.example.mascotas.repository.ContactoRepository;
@Service
public class ContactoServiceImpl implements ContactoService{

    @Autowired
    private ContactoRepository contactoRepository;

    @Override
    public Contacto guardarContacto(Contacto contacto) {

        return contactoRepository.save(contacto);
    }

    @Override
    public List<Contacto> listarContacto() {
   
        return contactoRepository.findAll();
    }
    
}
