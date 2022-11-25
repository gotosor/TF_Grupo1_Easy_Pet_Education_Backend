package com.example.mascotas.entity;



import javax.persistence.*;

@Entity
@Table(name = "articulo")
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CArticulo;
    private String NArticulo;
    private String TDescripcion;
    private String DFechaArticulo;
  
    @ManyToOne
    @JoinColumn(name = "CSeccion")
    private Seccion CSeccion;
  
    @ManyToOne
    @JoinColumn(name = "CAdmin")
    private Administrador CAdmin;

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

    public Seccion getCSeccion() {
        return CSeccion;
    }

    public void setCSeccion(Seccion CSeccion) {
        this.CSeccion = CSeccion;
    }

    public Administrador getCAdmin() {
        return CAdmin;
    }

    public void setCAdmin(Administrador CAdmin) {
        this.CAdmin = CAdmin;
    }

}
