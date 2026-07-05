package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// Nos conectamos al microservicio ms-catalogo 
@FeignClient(name = "ms-catalogo", url = "http://localhost:9090")
public interface MetodoPagoClient {

    @GetMapping("/api/catalogo/metodopago/{id}")
    MetodoPagoDTO obtenerPorId(@PathVariable("id") Integer id);
}