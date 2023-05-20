package com.project.Aprendex.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
public class Curso implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String nome;
    private String descricao;
    private String link;
    private String endereco;
    private String instituicao;
    private Double valor;

    public Curso(Long id, String nome, String descricao, String link, String endereco, String instituicao, Double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.link = link;
        this.endereco = endereco;
        this.instituicao = instituicao;
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", link='" + link + '\'' +
                ", endereco='" + endereco + '\'' +
                ", instituicao='" + instituicao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
