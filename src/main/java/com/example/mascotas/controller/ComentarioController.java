package com.example.mascotas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mascotas.dto.DtoComentario;
import com.example.mascotas.entity.Comentario;
import com.example.mascotas.service.ComentarioService;

@RestController
@RequestMapping("/comentario")
public class ComentarioController {

    @Autowired
    private ComentarioService comentarioService;

    @GetMapping
    public List<DtoComentario> listaComentario(){
        List<DtoComentario> ListaComentarios = new ArrayList<DtoComentario>();
        List<Comentario> lComentarios  = comentarioService.listarComentarios();
        for (Comentario comentario : lComentarios) {
            DtoComentario comentario2 = new DtoComentario();
            comentario2.setCcomentario(comentario.getCComentario());
            comentario2.setTdescripcion(comentario.getTDescripcion());
            comentario2.setCliente_ccliente(comentario.getCliente_CCliente().getCCliente());
            comentario2.setArticulo_carticulo(comentario.getArticulo_CArticulo().getCArticulo());
            ListaComentarios.add(comentario2);
        }
        return ListaComentarios;
    }

    @GetMapping("/cliente/{id}")
    public List<DtoComentario> listarComentarioPorCliente(@PathVariable("id") Integer id){
        List<DtoComentario> ListaComentariosCliente = new ArrayList<DtoComentario>();
        List<Comentario> lComentarios  = comentarioService.listarComentariosPorCliente(id);
        for (Comentario comentario : lComentarios) {
            DtoComentario comentario2 = new DtoComentario();
            comentario2.setCcomentario(comentario.getCComentario());
            comentario2.setTdescripcion(comentario.getTDescripcion());
            comentario2.setCliente_ccliente(comentario.getCliente_CCliente().getCCliente());
            comentario2.setArticulo_carticulo(comentario.getArticulo_CArticulo().getCArticulo());
            ListaComentariosCliente.add(comentario2);
        }
        return ListaComentariosCliente;
         
    }
    @GetMapping("/articulo/{id}")
    public List<DtoComentario> listarComentarioPorArticulo(@PathVariable("id") Integer id){
        List<DtoComentario> ListaComentariosArticulo = new ArrayList<DtoComentario>();
        List<Comentario> lComentarios  = comentarioService.listarComentariosPorArticulo(id);
        for (Comentario comentario : lComentarios) {
            DtoComentario comentario2 = new DtoComentario();
            comentario2.setCcomentario(comentario.getCComentario());
            comentario2.setTdescripcion(comentario.getTDescripcion());
            comentario2.setCliente_ccliente(comentario.getCliente_CCliente().getCCliente());
            comentario2.setArticulo_carticulo(comentario.getArticulo_CArticulo().getCArticulo());
            ListaComentariosArticulo.add(comentario2);
        }
        return ListaComentariosArticulo;
     
    }

    @PostMapping
    public Comentario agregComentario(@RequestBody DtoComentario comentario){
        return comentarioService.agregarComentario(comentario);
    }

    
}
