package com.example.mascotas.repository;


import com.example.mascotas.entity.Comentario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ComentarioRepository extends JpaRepository<Comentario, Integer> {

    @Query("SELECT c from Comentario c where c.Articulo_CArticulo.CArticulo = ?1")
    public List<Comentario> ComentarioPorArticulo(Integer idArticulo);

    @Query("SELECT c from Comentario c where c.Cliente_CCliente.CCliente = ?1")
    public List<Comentario> ComentarioPorCliente(Integer idCliente);


}
