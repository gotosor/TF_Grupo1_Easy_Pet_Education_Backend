package com.example.mascotas.repository;

import com.example.mascotas.entity.Cliente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
   @Query("SELECT c from Cliente c where c.TCorreo_Cliente = ?1")
   public List<Cliente> listaClientePorCorreo(String TCorreo_Cliente);
}
