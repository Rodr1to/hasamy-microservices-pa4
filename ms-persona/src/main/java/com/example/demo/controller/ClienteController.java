package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Cliente;
import com.example.demo.repository.ClienteRepository;

import java.util.List;

@RestController
@RequestMapping("/api/persona/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Cliente obtenerPorId(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
    }
    
    @PostMapping
    public Cliente guardar(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }

    @PutMapping("/{id}")
    public Cliente actualizar(@PathVariable Integer id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        return repository.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        repository.deleteById(id);
        
        
    }
    
}