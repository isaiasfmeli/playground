package com.github.isaiasfmeli.playground.modulo3.controller;

import com.github.isaiasfmeli.playground.modulo3.service.NumerosRomanosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/romanos")
public class NumerosRomanosController {

    @Autowired
    NumerosRomanosService service;

    @GetMapping()
    public String index()
    {
        return String.join(",",
                "/toint/{romano}",
                "/fromint/{inteiro}"
        );
    }

    @GetMapping("/toint/{romano}")
    public String convertToInt(@PathVariable String romano)
    {
        return service.convertToInt(romano).toString();
    }

    @GetMapping("/fromint/{inteiro}")
    public String convertFromInt(@PathVariable int inteiro)
    {
        return service.convertFromInt(inteiro);
    }

}
