package com.example.mascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mascotas.entity.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Integer>{
    
}
