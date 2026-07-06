package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.AuditoriaSistema;
import com.example.demo.service.AuditoriaSistemaService;
import java.util.List;

@RestController
@RequestMapping("/api/seguridad/auditoriasistema")
@RequiredArgsConstructor
public class AuditoriaSistemaController {

    private final AuditoriaSistemaService service;

    @GetMapping
    public List<AuditoriaSistema> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuditoriaSistema> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<AuditoriaSistema> guardar(@RequestBody AuditoriaSistema auditoriaSistema) {
        auditoriaSistema.setId(null);
        AuditoriaSistema creado = service.guardar(auditoriaSistema);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AuditoriaSistema> actualizar(@PathVariable Integer id, @RequestBody AuditoriaSistema entity) {
        return service.buscarPorId(id).map(as -> {
            as.setFechaAuditoria(entity.getFechaAuditoria());
            as.setAccion(entity.getAccion());
            as.setUsuarioId(entity.getUsuarioId());
            as.setIp(entity.getIp());
            as.setModuloId(entity.getModuloId());
            return ResponseEntity.ok(service.actualizar(as));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(as -> {
            service.eliminar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}