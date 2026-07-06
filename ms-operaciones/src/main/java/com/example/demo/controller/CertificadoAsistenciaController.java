package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.CertificadoAsistencia;
import com.example.demo.service.CertificadoAsistenciaService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/operaciones/certificadoasistencia")
@RequiredArgsConstructor
public class CertificadoAsistenciaController {

    private final CertificadoAsistenciaService service;

    @GetMapping
    public List<CertificadoAsistencia> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CertificadoAsistencia> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CertificadoAsistencia> guardar(@RequestBody CertificadoAsistencia entidad) {
        entidad.setId(null);
        CertificadoAsistencia creado = service.guardar(entidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CertificadoAsistencia> actualizar(@PathVariable Integer id, @RequestBody CertificadoAsistencia entidad) {
        return service.buscarPorId(id).map(ca -> {
            ca.setTicket(entidad.getTicket());
            ca.setFechaEmision(entidad.getFechaEmision());
            ca.setCodigoVerificacion(entidad.getCodigoVerificacion());
            return ResponseEntity.ok(service.actualizar(ca));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(ca -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
