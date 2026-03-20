package com.example.gerenciamento_autores.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_autor")
public class AutorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome_autor")
    private String nome;

    @Column(name = "nacionalidade_autor")
    private String nacionalidade;

    private LocalDateTime dataNascimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
