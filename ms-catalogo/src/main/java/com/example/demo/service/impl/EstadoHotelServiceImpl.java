package com.example.demo.service.impl;

import com.example.demo.entity.EstadoHotelEntity;
import com.example.demo.repository.EstadoHotelRepository;
import com.example.demo.service.EstadoHotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EstadoHotelServiceImpl implements EstadoHotelService {

    private final EstadoHotelRepository repository;

    @Override
    public List<EstadoHotelEntity> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<EstadoHotelEntity> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public EstadoHotelEntity guardar(EstadoHotelEntity entity) {
        return repository.save(entity);
    }

    @Override
    public EstadoHotelEntity actualizar(EstadoHotelEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
