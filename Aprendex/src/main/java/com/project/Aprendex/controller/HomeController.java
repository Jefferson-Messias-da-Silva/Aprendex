package com.project.Aprendex.controller;

import com.project.Aprendex.service.CursoService;
import com.project.Aprendex.service.UsuarioService;
import com.project.Aprendex.model.Curso;
import com.project.Aprendex.model.Usuario;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private CursoService cursoService;

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        return mv;
    }

    @GetMapping("/sobre")
    public String sobre () {

        return "sobre";
    }

    @GetMapping("/cadastrar")
    public String cadastro() {

        return "cadastro";
    }

    @RequestMapping (value="/save",method=RequestMethod.POST)
    public String cadastrando(@ModelAttribute Usuario usuario) {

        this.usuarioService.cadastrar(usuario);

        return "redirect:";
    }
    @PostMapping (value="/logado")
    public ModelAndView logado(HttpSession session, Usuario usuario) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("usuario", new Usuario());
        Usuario userLogin = this.usuarioService.login(usuario.getEmail(), usuario.getSenha());
        if(usuario == null){
            mv.setViewName("/login");
        }else {
            session.setAttribute("usuarioLogado",  userLogin);
            return home();
        }

        return mv;
    }

    @RequestMapping (value="/curso-cadastrado",method=RequestMethod.POST)
    public String cadastrocurso(Curso curso) {
        this.cursoService.cadastrarCurso(curso);


            return "redirect:";
    }

    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @GetMapping("/cursos")
    public String cursos(){

        return "telacurso";
    }
    @GetMapping("/cadastro-cursos")
    public String cadastrocursos(){

        return "cadastroCurso";
    }

}