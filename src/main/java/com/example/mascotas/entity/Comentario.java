package com.example.mascotas.entity;


import javax.persistence.*;

@Entity
@Table(name = "comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CComentario;
    private String TDescripcion;
    
    @ManyToOne
    @JoinColumn(name = "Articulo_CArticulo")
    private Articulo Articulo_CArticulo;
    
    @ManyToOne
    @JoinColumn(name = "Cliente_CCliente")
    private Cliente Cliente_CCliente;

    public Integer getCComentario() {
        return CComentario;
    }

    public void setCComentario(Integer CComentario) {
        this.CComentario = CComentario;
    }

    public String getTDescripcion() {
        return TDescripcion;
    }

    public void setTDescripcion(String TDescripcion) {
        this.TDescripcion = TDescripcion;
    }

    public Articulo getArticulo_CArticulo() {
        return Articulo_CArticulo;
    }

    public void setArticulo_CArticulo(Articulo articulo_CArticulo) {
        Articulo_CArticulo = articulo_CArticulo;
    }

    public Cliente getCliente_CCliente() {
        return Cliente_CCliente;
    }

    public void setCliente_CCliente(Cliente cliente_CCliente) {
        Cliente_CCliente = cliente_CCliente;
    }
}
