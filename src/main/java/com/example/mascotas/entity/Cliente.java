package com.example.mascotas.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CCliente;
    private String TCorreo_Cliente;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Rol_CId")
    private Rol Rol_CId;

    public Integer getCCliente() {
        return CCliente;
    }

    public void setCCliente(Integer CCliente) {
        this.CCliente = CCliente;
    }

    public String getTCorreo_Cliente() {
        return TCorreo_Cliente;
    }

    public void setTCorreo_Cliente(String TCorreo_Cliente) {
        this.TCorreo_Cliente = TCorreo_Cliente;
    }

    public Rol getRol_CId() {
        return Rol_CId;
    }

    public void setRol_CId(Rol rol_CId) {
        Rol_CId = rol_CId;
    }

    public Cliente() {
    }
}
