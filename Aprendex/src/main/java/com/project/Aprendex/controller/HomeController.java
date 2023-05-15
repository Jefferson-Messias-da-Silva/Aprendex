package com.project.Aprendex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String home(ModelMap model) {

        return "index.html";
    }

    @GetMapping("/{busca}")
    public String busca(@PathVariable String busca, ModelMap model) {
        model.addAttribute("busca", busca);

        return "";
    }
    @GetMapping("/sobre")
    public String sobre () {


        return "index.html";
    }
    @GetMapping("/cadastro")
    public String cadastro() {

        return "index.html";
    }
    @GetMapping("/login")
    public String login() {

        return "index.html";
    }

}