package com.project.Aprendex.Service;

import com.project.Aprendex.Repository.UsuarioRepository;
import com.project.Aprendex.model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public Usuario cadastrar( Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }
}