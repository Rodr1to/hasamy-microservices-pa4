package com.example.demo.service;

import com.example.demo.entity.Salon_Belleza;
import com.example.demo.repository.Salon_BellezaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Salon_BellezaService {

    @Autowired
    private Salon_BellezaRepository repository;

    public List<Salon_Belleza> listarTodos() {
        return repository.findAll();
    }

    public Salon_Belleza obtenerPorId(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    public Salon_Belleza guardar(Salon_Belleza salonBelleza) {
        return repository.save(salonBelleza);
    }

    public Salon_Belleza actualizar(Integer id, Salon_Belleza salonBelleza) {
        salonBelleza.setId(id);
        return repository.save(salonBelleza);
    }

    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}