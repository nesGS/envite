package com.nes.envite.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GameController {

/*    @Autowired
    private UserService userService;*/

    @GetMapping("/enviteHome")
    public String home(Model model) {
    return "enviteHome";
    }

    @GetMapping("/enviteStart")
    public String start(Model model) {
        return "enviteStart";
    }
}
