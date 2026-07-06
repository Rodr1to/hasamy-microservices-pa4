package com.example.demo.service;

import com.example.demo.entity.Comprobante_Pago;
import com.example.demo.repository.Comprobante_PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Comprobante_PagoService {

    @Autowired
    private Comprobante_PagoRepository repository;

    public List<Comprobante_Pago> listarTodos() {
        return repository.findAll();
    }

    public Comprobante_Pago obtenerPorId(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    public Comprobante_Pago guardar(Comprobante_Pago comprobantePago) {
        return repository.save(comprobantePago);
    }

    public Comprobante_Pago actualizar(Integer id, Comprobante_Pago comprobantePago) {
        comprobantePago.setId(id);
        return repository.save(comprobantePago);
    }

    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}