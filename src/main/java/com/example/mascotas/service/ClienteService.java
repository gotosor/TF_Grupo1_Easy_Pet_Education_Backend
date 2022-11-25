package com.example.mascotas.service;

import java.util.List;


import com.example.mascotas.entity.Cliente;


public interface ClienteService {
    public List<Cliente> listarCliente();
    public Cliente agregarCliente(Cliente cliente);
    public List<Cliente> encontrarCliente(String username);
  //  public List<Cliente> listByRol(Rol rol);
}
