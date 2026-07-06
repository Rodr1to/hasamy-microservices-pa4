package com.example.demo.service;

import com.example.demo.entity.HotelPonente;
import java.util.List;
import java.util.Optional;

public interface HotelPonenteService {
    List<HotelPonente> listarTodos();
    Optional<HotelPonente> buscarPorId(Integer id);
    HotelPonente guardar(HotelPonente entidad);
    HotelPonente actualizar(HotelPonente entidad);
    void eliminar(Integer id);
}
