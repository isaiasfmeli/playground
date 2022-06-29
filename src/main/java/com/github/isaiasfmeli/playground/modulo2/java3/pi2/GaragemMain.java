package com.github.isaiasfmeli.playground.modulo2.java3.pi2;

import java.util.Comparator;
import java.util.IntSummaryStatistics;

public class GaragemMain {

    public static void main(String[] args) {
        Garagem garagem = new Garagem(1);
        // Ford
        garagem.putVeiculo(new Veiculo("Fiesta", Veiculo.Marca.FORD, 1000));
        garagem.putVeiculo(new Veiculo("Focus", Veiculo.Marca.FORD, 1200));
        garagem.putVeiculo(new Veiculo("Explorer", Veiculo.Marca.FORD, 2500));
        // Fiat
        garagem.putVeiculo(new Veiculo("Uno", Veiculo.Marca.FIAT, 500));
        garagem.putVeiculo(new Veiculo("Cronos", Veiculo.Marca.FIAT, 1000));
        garagem.putVeiculo(new Veiculo("Torino", Veiculo.Marca.FIAT, 1250));
        // Chevrolet
        garagem.putVeiculo(new Veiculo("Aveo", Veiculo.Marca.CHEVROLET, 1250));
        garagem.putVeiculo(new Veiculo("Spin", Veiculo.Marca.CHEVROLET, 2500));
        // Toyota
        garagem.putVeiculo(new Veiculo("Corola", Veiculo.Marca.TOYOTA, 1200));
        garagem.putVeiculo(new Veiculo("Fortuner", Veiculo.Marca.TOYOTA, 3000));
        // Renault
        garagem.putVeiculo(new Veiculo("Logan", Veiculo.Marca.RENAULT, 950));

        // Preco Sort
        garagem.getVeiculos().stream()
                .sorted(Comparator.comparing(v -> Integer.valueOf(v.getPreco())))
                .forEach(v -> System.out.println(v.getPreco() + " - " + v.toString()));
        System.out.println("----------");

        // Marca Sort
        garagem.getVeiculos().stream()
                .sorted(Comparator.comparing(v -> v.getMarca()))
                .forEach(v -> System.out.println(v.getMarca() + " - " + v.toString()));
        System.out.println("----------");

        // Filter preco até 1000
        garagem.getVeiculos().stream()
                .filter(v -> v.getPreco() < 1000)
                .forEach(v -> System.out.println(v.getPreco() + " - " + v.toString()));
        System.out.println("----------");

        // Filter preco maior ou igual a 1000
        garagem.getVeiculos().stream()
                .filter(v -> v.getPreco() >= 1000)
                .sorted(Comparator.comparing(v -> Integer.valueOf(v.getPreco())))
                .forEach(v -> System.out.println(v.getPreco() + " - " + v.toString()));

        // Com o preço médio total de toda a lista de veículos.
        IntSummaryStatistics stats = garagem.getVeiculos().stream()
                .mapToInt((v) -> v.getPreco())
                .summaryStatistics();
        System.out.printf("O preço médio dos Veículos é %f", stats.getAverage());
    }
}
