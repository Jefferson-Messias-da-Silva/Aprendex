package com.project.Aprendex.model;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection="Usuarios")
public class Usuario {


    @Id
    private String id;

    private String nome;
    private String sobrenome;
    private String login;
    private String senha;
    private String email;
    private Integer tipo;
    private Date dtnascimento;
    public Usuario(String id, String nome, String sobrenome, String login, String senha, String email, Integer tipo, Date dtnascimento) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.tipo = tipo;
        this.dtnascimento = dtnascimento;
    }

    public Usuario() {

    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                ", tipo=" + tipo +
                ", data de nascimento=" + dtnascimento +
                '}';
    }
}
