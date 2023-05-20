package com.project.Aprendex.service;

import com.project.Aprendex.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioService{
    public Usuario cadastrar(Usuario usuario);

    public boolean encontrarEmail(Usuario usuario);

    public boolean validaEmail(Usuario usuario);

    public Usuario login(String email, String senha);
}
