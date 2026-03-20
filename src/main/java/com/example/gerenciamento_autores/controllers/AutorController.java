package com.example.gerenciamento_autores.controllers;

import com.example.gerenciamento_autores.models.AutorModel;
import com.example.gerenciamento_autores.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @PostMapping
    public ResponseEntity<AutorModel> criar(@RequestBody AutorModel autorModel) {
        AutorModel novo = autorService.salvar(autorModel);
        URI uri = URI.create("/autores/" + novo.getId());
        return ResponseEntity.created(uri).body(novo);
    }

    @GetMapping
    public ResponseEntity<List<AutorModel>> listar() {
        return ResponseEntity.ok(autorService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AutorModel> buscar(@PathVariable Long id) {
        AutorModel autor = autorService.buscarPorId(id);

        if (autor == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(autor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AutorModel> atualizar(@PathVariable Long id, @RequestBody AutorModel autorModel) {
        AutorModel atualizado = autorService.atualizar(id, autorModel);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        autorService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}