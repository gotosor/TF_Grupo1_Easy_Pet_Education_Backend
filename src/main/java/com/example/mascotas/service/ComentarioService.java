package com.example.mascotas.service;

import java.util.List;

import com.example.mascotas.dto.DtoComentario;
import com.example.mascotas.entity.Comentario;

public interface ComentarioService {
    public List<Comentario> listarComentarios();

    public List<Comentario> listarComentariosPorCliente(Integer idCliente);

    public List<Comentario> listarComentariosPorArticulo(Integer idArticulo);

    public Comentario agregarComentario(DtoComentario comentario);
}
