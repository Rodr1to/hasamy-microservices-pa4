package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// Nos conectamos a ms-persona

@FeignClient(name = "ms-persona", url = "http://localhost:9091")
public interface ClienteClient {

    @GetMapping("/api/persona/cliente/{id}")
    ClienteDTO obtenerPorId(@PathVariable("id") Integer id);
}