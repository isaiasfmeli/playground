package com.github.isaiasfmeli.playground.modulo3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica que esta classe é controller Rest
@RequestMapping("/world")
public class World {

    @GetMapping // requesição GET
    public String index()
    {
        return "World!";
    }

}
