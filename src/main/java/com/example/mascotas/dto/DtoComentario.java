package com.example.mascotas.dto;

public class DtoComentario {
    private Integer ccomentario;
    private String tdescripcion;
    private Integer articulo_carticulo;
    private Integer cliente_ccliente;

    public Integer getCcomentario() {
        return ccomentario;
    }

    public void setCcomentario(Integer ccomentario) {
        this.ccomentario = ccomentario;
    }

    public String getTdescripcion() {
        return tdescripcion;
    }

    public void setTdescripcion(String tdescripcion) {
        this.tdescripcion = tdescripcion;
    }

    public Integer getArticulo_carticulo() {
        return articulo_carticulo;
    }

    public void setArticulo_carticulo(Integer articulo_carticulo) {
        this.articulo_carticulo = articulo_carticulo;
    }

    public Integer getCliente_ccliente() {
        return cliente_ccliente;
    }

    public void setCliente_ccliente(Integer cliente_ccliente) {
        this.cliente_ccliente = cliente_ccliente;
    }
}
