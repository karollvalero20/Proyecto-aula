package com.tecnologico.Gestion.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginControler {

    @GetMapping("inicio")
    public String inicio(){
        return "Hola mundo";


    }
}
