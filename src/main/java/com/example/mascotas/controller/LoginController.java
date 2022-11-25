package com.example.mascotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mascotas.dto.DtoLogin;
import com.example.mascotas.dto.DtoRol;
import com.example.mascotas.entity.Administrador;

import com.example.mascotas.entity.Cliente;
import com.example.mascotas.service.AdministradorService;
import com.example.mascotas.service.ClienteService;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private ClienteService clienteService;
    @Autowired
    private AdministradorService administradorService;

    @PostMapping
    public DtoRol Ingreso(@RequestBody DtoLogin login){
        DtoRol rol = new DtoRol();

        if(administradorService.encontrarAdministrador(login.getUsername()).isEmpty()){
            List<Cliente> clienteencontrado = clienteService.encontrarCliente(login.getUsername()); 
            for (Cliente cliente : clienteencontrado) {
                if(cliente.getRol_CId().getCClave().equals(login.getPassword())){
                    rol.setId(cliente.getRol_CId().getCId());
                    rol.setIdEntidad(cliente.getCCliente());
                    rol.setNnombre(cliente.getRol_CId().getNNombre());
                    rol.setCorreo(cliente.getTCorreo_Cliente());
                    rol.setDfechaNacimiento(cliente.getRol_CId().getDFechaNacimiento());
                    rol.setCclave(cliente.getRol_CId().getCClave());
                    rol.setNapellido(cliente.getRol_CId().getNApellido());
                    rol.setRol("cliente");

                    return rol;
                }else{
                    return null;
                }
                
            }
        }else if(clienteService.encontrarCliente(login.getUsername()).isEmpty()){
            List<Administrador> administradors = administradorService.encontrarAdministrador(login.getUsername());
            for (Administrador administrador : administradors) {

                if(administrador.getRol_CId().getCClave().equals(login.getPassword())){
                    rol.setId(administrador.getRol_CId().getCId());
                    rol.setIdEntidad(administrador.getCAdmin());
                    rol.setNnombre(administrador.getRol_CId().getNNombre());
                    rol.setCorreo(administrador.getTCorreo_Admin());
                    rol.setDfechaNacimiento(administrador.getRol_CId().getDFechaNacimiento());
                    rol.setCclave(administrador.getRol_CId().getCClave());
                    rol.setNapellido(administrador.getRol_CId().getNApellido());
                    rol.setRol("administrador");
                    
                    return rol;
                }else{
                    return null;
                }
                
            }
           
        }
        return null;

    }


    
}
