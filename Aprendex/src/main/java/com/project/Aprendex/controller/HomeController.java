package com.project.Aprendex.controller;

import com.project.Aprendex.service.UsuarioService;
import com.project.Aprendex.model.Curso;
import com.project.Aprendex.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public String home(ModelMap model) {

        return "index";
    }


    private Curso cursoService;

    @GetMapping("/sobre")
    public String sobre () {

        return "index";
    }
    @GetMapping("/cadastrar")
    public String cadastro() {


        return "cadastrar";
    }
    @RequestMapping (value="/save",method=RequestMethod.POST)
    public String cadastrando(@ModelAttribute Usuario usuario) {


        this.usuarioService.cadastrar(usuario);


        return "redirect:";
    }
    @RequestMapping (value="/logado",method=RequestMethod.POST)
    public String logado(String email, String senha) {

        if(this.usuarioService.login(email,senha) == null){
            return "redirect:login";
        }else {

            return "redirect:";
        }
    }

    @GetMapping("/login")
    public String login() {

        return "login";
    }

}