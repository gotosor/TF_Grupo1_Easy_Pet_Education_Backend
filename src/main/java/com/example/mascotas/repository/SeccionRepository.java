package com.example.mascotas.repository;

import com.example.mascotas.entity.Seccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeccionRepository extends JpaRepository<Seccion, Integer> {

    public Seccion findByCSeccion(Integer cSeccion);
}
