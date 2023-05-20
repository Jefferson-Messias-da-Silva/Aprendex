package com.project.Aprendex.Repository;

import com.project.Aprendex.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends MongoRepository <Usuario, String> {

    Optional<Usuario> findByEmail(String email);

    public Usuario findByEmailAndSenha(String email, String senha);
}
