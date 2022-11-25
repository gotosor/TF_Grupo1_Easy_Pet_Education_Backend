package com.example.mascotas.entity;

import javax.persistence.*;

@Entity
@Table(name = "contacto")
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contacto_id;
    private String correo;
    private String nombre_completo;
    private String numero_celular;
    private String texto;

    public Integer getContacto_id() {
        return contacto_id;
    }

    public void setContacto_id(Integer contacto_id) {
        this.contacto_id = contacto_id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getNumero_celular() {
        return numero_celular;
    }

    public void setNumero_celular(String numero_celular) {
        this.numero_celular = numero_celular;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
