package com.example.mascotas.dto;

import java.util.List;

import com.example.mascotas.entity.Animal;
import com.example.mascotas.entity.Fuente;

public class DtoArticuloR {
    private Integer CArticulo;
    private String NArticulo;
    private String TDescripcion;
    private String DFechaArticulo;
    private Integer CSeccion;
    private Integer CAdmin;
    private List<Fuente> listFuente;
    private List<Animal> lAnimals;

    public Integer getCArticulo() {
        return CArticulo;
    }

    public void setCArticulo(Integer CArticulo) {
        this.CArticulo = CArticulo;
    }

    public String getNArticulo() {
        return NArticulo;
    }

    public void setNArticulo(String NArticulo) {
        this.NArticulo = NArticulo;
    }

    public String getTDescripcion() {
        return TDescripcion;
    }

    public void setTDescripcion(String TDescripcion) {
        this.TDescripcion = TDescripcion;
    }

    public String getDFechaArticulo() {
        return DFechaArticulo;
    }

    public void setDFechaArticulo(String DFechaArticulo) {
        this.DFechaArticulo = DFechaArticulo;
    }

    public Integer getCSeccion() {
        return CSeccion;
    }

    public void setCSeccion(Integer CSeccion) {
        this.CSeccion = CSeccion;
    }

    public Integer getCAdmin() {
        return CAdmin;
    }

    public void setCAdmin(Integer CAdmin) {
        this.CAdmin = CAdmin;
    }

    public List<Fuente> getListFuente() {
        return listFuente;
    }

    public void setListFuente(List<Fuente> listFuente) {
        this.listFuente = listFuente;
    }

    public List<Animal> getlAnimals() {
        return lAnimals;
    }

    public void setlAnimals(List<Animal> lAnimals) {
        this.lAnimals = lAnimals;
    }
}
