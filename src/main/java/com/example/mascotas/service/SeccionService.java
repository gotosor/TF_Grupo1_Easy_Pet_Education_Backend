package com.example.mascotas.service;

import java.util.List;

import com.example.mascotas.entity.Seccion;

public interface SeccionService {
    public Seccion guardarSeccion(Seccion seccion);

    public List<Seccion> listarSeccion();

    public Seccion actualizarSeccion(Seccion seccion);

    public void eliminarSeccion(int id);

    public Seccion encontrarSeccion(int id);
}
