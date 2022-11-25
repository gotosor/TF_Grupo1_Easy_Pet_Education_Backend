package com.example.mascotas.repository;

import com.example.mascotas.entity.Administrador;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdministradorRepository extends JpaRepository<Administrador, Integer> {
    @Query("SELECT a from Administrador a where a.TCorreo_Admin = ?1")
    public List<Administrador> listaAdministradorPorCorreo(String TCorreo_Admin);
}
