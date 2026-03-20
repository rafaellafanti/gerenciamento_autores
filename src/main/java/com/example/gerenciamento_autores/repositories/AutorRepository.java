package com.example.gerenciamento_autores.repositories;

import com.example.gerenciamento_autores.models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<AutorModel, Long> {

}
