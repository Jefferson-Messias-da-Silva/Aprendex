package com.project.Aprendex.service;

import com.project.Aprendex.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioService{
    Usuario cadastrar(Usuario usuario);

    boolean encontrarEmail(Usuario usuario);

    boolean validaEmail(Usuario usuario);

    Usuario login(String email, String senha);
}
