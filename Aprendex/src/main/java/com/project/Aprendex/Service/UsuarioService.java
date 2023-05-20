package com.project.Aprendex.Service;

import com.project.Aprendex.model.Usuario;
import org.springframework.stereotype.Service;


public interface UsuarioService{
    public Usuario cadastrar(Usuario usuario);

    public boolean encontrarEmail(Usuario usuario);

    public boolean validaEmail(Usuario usuario);

    public Usuario login(String email, String senha);
}
