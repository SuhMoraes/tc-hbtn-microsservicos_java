package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/messages")
public class MessageResource {

    @GetMapping("/simpleMessageWelcome")
    public String simpleMessageWelcome(String message) {
        return "BEM VINDO A AULA DE MICROSERVIÇO USANDO SPRING BOOT !!!";
    }

    @GetMapping("/login/{user}/{password}")
    public String login (@PathVariable String user, String password) throws Exception {
        String message = "LOGIN EFETUADO COM SUCESSO !!!";
        String user1 = "manow";
        String senha = "9899";

        if( user1.isBlank() && senha.isBlank()) {
            message = "USUÁRIO E SENHA NÃO INFORMADOS";
        }
        if(user1.length() > 15 && senha.length() >15){
           message = "USUÁRIO E SENHA INVÁLIDOS";
        }
        return message;
    }

}
