package com.example.mascotas.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CAdmin;
    private String TCorreo_Admin;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Rol_CId")
    private Rol Rol_CId;

    public Integer getCAdmin() {
        return CAdmin;
    }

    public void setCAdmin(Integer CAdmin) {
        this.CAdmin = CAdmin;
    }

    public String getTCorreo_Admin() {
        return TCorreo_Admin;
    }

    public void setTCorreo_Admin(String TCorreo_Admin) {
        this.TCorreo_Admin = TCorreo_Admin;
    }

    public Rol getRol_CId() {
        return Rol_CId;
    }

    public void setRol_CId(Rol rol_CId) {
        Rol_CId = rol_CId;
    }

    public Administrador() {
    }
}
