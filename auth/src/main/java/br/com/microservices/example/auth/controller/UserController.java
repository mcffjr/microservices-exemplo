package br.com.microservices.example.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/")
public class UserController {

    @GetMapping("/user")
    public Principal user(Principal user){
        return user;
    }

}