package com.example.demo.service.impl;

import com.example.demo.entity.SalonBelleza;
import com.example.demo.repository.SalonBellezaRepository;
import com.example.demo.service.SalonBellezaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalonBellezaServiceImpl implements SalonBellezaService {

    @Autowired
    private SalonBellezaRepository repository;

    @Override
    public List<SalonBelleza> listarTodos() {
        return repository.findAll();
    }

    @Override
    public SalonBelleza obtenerPorId(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public SalonBelleza guardar(SalonBelleza salonBelleza) {
        return repository.save(salonBelleza);
    }

    @Override
    public SalonBelleza actualizar(Integer id, SalonBelleza salonBelleza) {
        salonBelleza.setId(id);
        return repository.save(salonBelleza);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}