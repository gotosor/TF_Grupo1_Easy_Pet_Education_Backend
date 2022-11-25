package com.example.mascotas.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mascotas.entity.Cliente;

import com.example.mascotas.repository.ClienteRepository;
@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listarCliente() {

        return clienteRepository.findAll();
    }

    @Override
    public Cliente agregarCliente(Cliente cliente) {
 
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> encontrarCliente(String username) {
        
        return clienteRepository.listaClientePorCorreo(username);
    }

    
}
