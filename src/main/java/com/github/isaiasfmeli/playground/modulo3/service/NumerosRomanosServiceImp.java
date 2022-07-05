package com.github.isaiasfmeli.playground.modulo3.service;

import org.springframework.stereotype.Service;
import java.util.Collections;

@Service
public class NumerosRomanosServiceImp implements NumerosRomanosService {

    int [] valores = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String [] romanos = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public Integer convertToInt(String romano)
    {
        int n = 0;
        int numeralDaDireita = 0;
        for (int i = romano.length() - 1; i >= 0; i--) {
            int valor = fromRomanoChar(romano.charAt(i)).intValue();
            double multiplicador = Math.signum(valor + 0.5 - numeralDaDireita);
            n += valor * multiplicador;
            numeralDaDireita = valor;
        }
        return n;
    }

    private Double fromRomanoChar(char letra)
    {
        return Math.floor(Math.pow(10, "IXCM".indexOf(letra))) + 5 * Math.floor(Math.pow(10, "VLD".indexOf(letra)));
    }

    public String convertFromInt(int value)
    {
        StringBuilder resultado = new StringBuilder();
        for(int i=0; i< valores.length; i++) {
            int parteInteira = value/ valores[i];
            value -= valores[i] * parteInteira;
            resultado.append(String.join("", Collections.nCopies(parteInteira, romanos[i])));
        }
        return resultado.toString();
    }
}
