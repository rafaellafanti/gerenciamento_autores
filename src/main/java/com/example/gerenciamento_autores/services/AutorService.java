package com.example.gerenciamento_autores.services;

import com.example.gerenciamento_autores.models.AutorModel;
import com.example.gerenciamento_autores.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorModel salvar(AutorModel autorModel) {
        return autorRepository.save(autorModel);
    }

    public List<AutorModel> listarTodos() {
        return autorRepository.findAll();
    }

    public AutorModel buscarPorId(Long id) {
        return autorRepository.findById(id).orElse(null);
    }

    public AutorModel atualizar(Long id, AutorModel autorModel) {
        autorModel.setId(id);
        return autorRepository.save(autorModel);
    }

    public void deletar(Long id) {
        autorRepository.deleteById(id);
    }
}

