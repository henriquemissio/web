package com.example.web.resources;
//Recurso web

import com.example.web.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    //metodo que sera um endpoint para acessar os usuarios
    //findall retorna os usuarios
    @GetMapping //Indica que é um metodo que responde a requisicao do tipo GET do HTTP
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Maria", "maria@gmail.com", "999999", "123456");
        return ResponseEntity.ok().body(u);
    }
}
