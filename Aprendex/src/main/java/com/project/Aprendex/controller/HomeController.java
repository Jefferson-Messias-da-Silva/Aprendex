package com.project.Aprendex.controller;

import com.project.Aprendex.Service.UsuarioService;
import com.project.Aprendex.model.Curso;
import com.project.Aprendex.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @GetMapping("/login")
    public String login() {

        return "login";
    }

}