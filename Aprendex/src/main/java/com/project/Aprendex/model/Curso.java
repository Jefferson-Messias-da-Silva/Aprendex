package com.project.Aprendex.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "CURSO")
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

    public Curso() {}

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
