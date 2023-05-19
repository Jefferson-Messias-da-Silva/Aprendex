package com.project.Aprendex.Repository;

import com.project.Aprendex.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository <Usuario, String> {

}
