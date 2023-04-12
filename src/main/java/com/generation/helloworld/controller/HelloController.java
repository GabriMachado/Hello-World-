package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
    public String hello() {
    	return "<b>Hello turma 62!</b>";
    }
	
	@GetMapping("/nome")
    public String meuNome() {
    	return "<b>Gabriel</b>";
    }
	@GetMapping("/bsm")
    public String bsm() {
    	return "<b>Mentalidade de Crecimento, Perisistência, Orientação ao Futuro, Orientação ao Detalhe, Gestão de Tempo, Comunicação não Agressiva</b>";
    }
	@GetMapping("/obj")
    public String objetivo() {
    	return "<b>Meu objetivo é ser persistente, ás vezes os desafios nos atrapalha á manter o foco e seguir. Essa semana mesmo com dificuldade de compreensão das atividades foquei em ser persistente e continuar.</b>";
    }
}

