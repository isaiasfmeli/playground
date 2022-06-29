package com.github.isaiasfmeli.playground;

import com.github.isaiasfmeli.playground.modulo2.CorridaNaSelva;
import com.github.isaiasfmeli.playground.modulo2.TemperaturasGlobais;
import com.github.isaiasfmeli.playground.modulo2.java2.ex1.Pessoa;
import com.github.isaiasfmeli.playground.modulo2.java3.pi2.GaragemMain;

public class PlayGround {

    public static void main(String[] args) {
        System.out.println("- Módulo 2 / JAVA I / Prática Integradora 1 / Temperaturas Globais");
        TemperaturasGlobais.main(args);

        System.out.println("- Módulo 2 / JAVA I / Prática Integradora 2 / Corrida Na Selva");

        System.out.println("- Módulo 2 / JAVA II / Prática Integradora 1 / Exercício 1");
        Pessoa isaias = new Pessoa("1", "Isaias");
        isaias.setIdade(28);
        isaias.setPeso(68.5);
        isaias.setAltura(1.75);
        System.out.println(isaias);

        System.out.println("- Módulo 2 / JAVA III / Prática Integradora 2 / Exercícios");
        GaragemMain.main(args);
    }
}
