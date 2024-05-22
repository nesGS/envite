package com.nes.envite.controller;

import com.nes.envite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

    @Autowired
    private UserService userService;

    @GetMapping("/lobby")
    public String lobbyGame(Model model) {
        model.addAttribute("lista_alumnos", userService.listUsers());
        return "alumnos";
    }
}
