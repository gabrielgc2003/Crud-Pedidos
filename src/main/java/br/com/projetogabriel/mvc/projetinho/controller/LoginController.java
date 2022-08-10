package br.com.projetogabriel.mvc.projetinho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
      @GetMapping
      @RequestMapping("/login")
      public String login(){
            return "login";
      }
}
