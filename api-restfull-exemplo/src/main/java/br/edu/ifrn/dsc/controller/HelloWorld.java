package br.edu.ifrn.dsc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HelloWorld {
    
    @GetMapping
    public String home(){
        return "Hello World";
    }

    @PostMapping
    public String receber(@RequestBody String dados){
        System.out.println(dados);
        return dados;
    }
}
