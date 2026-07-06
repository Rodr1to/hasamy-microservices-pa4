package com.example.demo.service;

import com.example.demo.entity.VueloPonente;
import java.util.List;
import java.util.Optional;

public interface VueloPonenteService {
    List<VueloPonente> listarTodos();
    Optional<VueloPonente> buscarPorId(Integer id);
    VueloPonente guardar(VueloPonente entidad);
    VueloPonente actualizar(VueloPonente entidad);
    void eliminar(Integer id);
}
