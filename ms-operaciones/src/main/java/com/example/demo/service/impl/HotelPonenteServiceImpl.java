package com.example.demo.service.impl;

import com.example.demo.entity.HotelPonente;
import com.example.demo.repository.HotelPonenteRepository;
import com.example.demo.service.HotelPonenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HotelPonenteServiceImpl implements HotelPonenteService {
    private final HotelPonenteRepository repository;

    @Override
    public List<HotelPonente> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<HotelPonente> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public HotelPonente guardar(HotelPonente entidad) {
        return repository.save(entidad);
    }

    @Override
    public HotelPonente actualizar(HotelPonente entidad) {
        return repository.save(entidad);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
