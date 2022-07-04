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

    final NumerosRomanosService nr;

    @Autowired
    public NumerosRomanosController(NumerosRomanosService nr) {
        this.nr = nr;
    }

    @GetMapping()
    public String index()
    {
        return String.join(",",
                "/toint/{romano}",
                "/toromano/{inteiro}"
        );
    }

    @GetMapping("/toint/{romano}")
    public String convertToInt(@PathVariable String romano)
    {
        return nr.convertToInt(romano).toString();
    }

    @GetMapping("/toromano/{inteiro}")
    public String convertToRomano(@PathVariable int inteiro)
    {
        return nr.convertToRomano(inteiro);
    }

}
