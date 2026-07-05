package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.UsuarioRol;
import com.example.demo.service.UsuarioRolService;
import java.util.List;

@RestController
@RequestMapping("/api/seguridad/usuario-rol")
@RequiredArgsConstructor
public class UsuarioRolController {

    private final UsuarioRolService service;

    @GetMapping
    public List<UsuarioRol> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{usuarioId}/{rolId}")
    public ResponseEntity<UsuarioRol> obtenerPorId(@PathVariable Integer usuarioId, @PathVariable Integer rolId) {
        return service.buscarPorId(usuarioId, rolId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UsuarioRol> guardar(@RequestBody UsuarioRol usuarioRol) {
        UsuarioRol creado = service.guardar(usuarioRol);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @DeleteMapping("/{usuarioId}/{rolId}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer usuarioId, @PathVariable Integer rolId) {
        return service.buscarPorId(usuarioId, rolId).map(ur -> {
            service.eliminar(usuarioId, rolId);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}