package com.exercicio07.exercicio07.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicio07 {

    @GetMapping("/recomendar")
    public String recomendarFilme(@RequestParam String genero, @RequestParam String ambiente) {
        if ("acao".equalsIgnoreCase(genero) && "futurista".equalsIgnoreCase(ambiente)) {
            return "Homens de Preto";
        } else if ("acao".equalsIgnoreCase(genero) && "moderno".equalsIgnoreCase(ambiente)) {
            return "John Wick";
        } else if ("romance".equalsIgnoreCase(genero) && "clássico".equalsIgnoreCase(ambiente)) {
            return "Orgulho e Preconceito";
        } else if ("comedia".equalsIgnoreCase(genero) && "familiar".equalsIgnoreCase(ambiente)) {
            return "A Família Addams";
        } else {
            return "Desculpe, não tenho uma recomendação para esses critérios.";
        }
    }
}
