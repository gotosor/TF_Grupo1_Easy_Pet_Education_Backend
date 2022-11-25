package com.example.mascotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mascotas.dto.DtoComentario;
import com.example.mascotas.entity.Articulo;
import com.example.mascotas.entity.Cliente;
import com.example.mascotas.entity.Comentario;
import com.example.mascotas.repository.ComentarioRepository;
@Service
public class ComentarioServiceImpl implements ComentarioService{

    @Autowired
    private ComentarioRepository comentarioRepository;

    @Override
    public List<Comentario> listarComentarios() {
    
        return comentarioRepository.findAll();
    }

    @Override
    public List<Comentario> listarComentariosPorCliente(Integer idCliente) {
    
        return comentarioRepository.ComentarioPorCliente(idCliente);
    }

    @Override
    public List<Comentario> listarComentariosPorArticulo(Integer idArticulo) {
     
        return comentarioRepository.ComentarioPorArticulo(idArticulo);
    }

    @Override
    public Comentario agregarComentario(DtoComentario comentario) {
        Comentario comentario2 = new Comentario();
        Cliente cliente2 = new Cliente();
        cliente2.setCCliente(comentario.getCliente_ccliente());

        Articulo articulo2 = new Articulo();
        articulo2.setCArticulo(comentario.getArticulo_carticulo());

        
        comentario2.setTDescripcion(comentario.getTdescripcion());
        comentario2.setCliente_CCliente(cliente2);
        comentario2.setArticulo_CArticulo(articulo2);
        return comentarioRepository.save(comentario2);
    }
    
}
