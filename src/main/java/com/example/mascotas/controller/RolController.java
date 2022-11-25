package com.example.mascotas.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mascotas.dto.DtoRol;
import com.example.mascotas.entity.Administrador;
import com.example.mascotas.entity.Cliente;

import com.example.mascotas.service.AdministradorService;
import com.example.mascotas.service.ClienteService;


@RestController
@RequestMapping("/rol")
public class RolController {


    @Autowired
    private AdministradorService administradorService;

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente")
    public List<Cliente> listarCliente(){
        return clienteService.listarCliente();
    }
    @GetMapping("/administrador")
    public List<Administrador> listarAdministrador(){
        return administradorService.listarAdministrador();
    }
    @GetMapping
    public List<DtoRol> listarRol(){
        List<DtoRol> listarRolDTO = new ArrayList<DtoRol>();
        List<Cliente> listarCliente = clienteService.listarCliente();
        List<Administrador> lAdministradors = administradorService.listarAdministrador();
        for (Cliente clliente : listarCliente) {
            DtoRol dtoRol = new DtoRol();
            dtoRol.setId(clliente.getRol_CId().getCId());
            dtoRol.setIdEntidad(clliente.getCCliente());
            dtoRol.setNnombre(clliente.getRol_CId().getNNombre());
            dtoRol.setNapellido(clliente.getRol_CId().getNApellido());
            dtoRol.setCorreo(clliente.getTCorreo_Cliente());
            dtoRol.setDfechaNacimiento(clliente.getRol_CId().getDFechaNacimiento());
            dtoRol.setCclave(clliente.getRol_CId().getCClave());
            dtoRol.setRol("cliente");
            listarRolDTO.add(dtoRol);
        }
        for (Administrador administrador : lAdministradors) {
            DtoRol dtoRol = new DtoRol();
            dtoRol.setId(administrador.getRol_CId().getCId());
            dtoRol.setIdEntidad(administrador.getCAdmin());
            dtoRol.setNnombre(administrador.getRol_CId().getNNombre());
            dtoRol.setNapellido(administrador.getRol_CId().getNApellido());
            dtoRol.setCorreo(administrador.getTCorreo_Admin());
            dtoRol.setDfechaNacimiento(administrador.getRol_CId().getDFechaNacimiento());
            dtoRol.setCclave(administrador.getRol_CId().getCClave());
            dtoRol.setRol("administrador");
            listarRolDTO.add(dtoRol);
        }
        return listarRolDTO;

    }
    
}
