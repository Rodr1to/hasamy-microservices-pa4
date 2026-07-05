package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.ClienteClient;
import com.example.demo.client.ClienteDTO;
import com.example.demo.entity.Orden;
import com.example.demo.repository.OrdenRepository;

import java.util.List;

@RestController
@RequestMapping("/api/operaciones/orden")
public class OrdenController {

    @Autowired
    private OrdenRepository repository;

    @Autowired
    private ClienteClient clienteClient;

    @GetMapping
    public List<Orden> listarTodos() {
        return repository.findAll();
    }

    
    @GetMapping("/cliente/{id}")
    public ClienteDTO consultarClienteExterno(@PathVariable Integer id) {
        return clienteClient.obtenerPorId(id);
    }
}