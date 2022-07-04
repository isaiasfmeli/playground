package com.github.isaiasfmeli.playground.modulo3.service;

import org.springframework.stereotype.Service;
import java.util.Collections;

@Service
public class NumerosRomanosService {

    int [] valores = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String [] romanos = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public Integer convertToInt(String romano)
    {
        return 0;
    }

    public String convertToRomano(int value)
    {
        StringBuilder resultado = new StringBuilder();
        for(int i=0; i< valores.length; i++) {
            int parteInteira = value/ valores[i];
            value -= valores[i] * parteInteira;
            resultado.append(String.join("", Collections.nCopies(parteInteira,romanos[i])));
        }
        return resultado.toString();
    }
}
