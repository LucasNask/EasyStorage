package com.ni.easystorage.easystorage.controller;

import com.ni.easystorage.easystorage.business.ClienteService;
import com.ni.easystorage.easystorage.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente")
    public Cliente findByDocumento(@RequestParam String documento){
        return clienteService.findByDocumento(documento);
    }

    @GetMapping("/cliente")
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }

}
