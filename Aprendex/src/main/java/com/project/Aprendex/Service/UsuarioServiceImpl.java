package com.project.Aprendex.Service;

import com.project.Aprendex.Repository.UsuarioRepository;
import com.project.Aprendex.model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public Usuario cadastrar( Usuario usuario) {
        if(encontrarEmail(usuario)) {
            if (validaEmail(usuario)){
                return this.usuarioRepository.save(usuario);
            }else {
                throw new IllegalStateException("Email Invalido");
            }
        }else {
            throw new IllegalStateException("Email já cadastrado");
        }
    }

    @Override
    public Usuario login(String email, String senha){
        Usuario usuario = usuarioRepository.findByEmailAndSenha(email,senha);
        return usuario;
    }
    @Override
    public boolean encontrarEmail(Usuario usuario){
        Optional<Usuario> existEmail = this.usuarioRepository.findByEmail(usuario.getEmail());
        if(existEmail.isPresent())
            return false;
        return true;
    }

    @Override
    public boolean validaEmail(Usuario usuario){
        String email = usuario.getEmail();
        int validar = email.indexOf("@");

        System.out.println(validar);
        if(validar>0){
            return true;
        }
        return false;
    }
}