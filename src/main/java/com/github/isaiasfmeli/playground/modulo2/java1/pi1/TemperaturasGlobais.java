package com.github.isaiasfmeli.playground.modulo2.java1.pi1;

public class TemperaturasGlobais {

    public static final int COLUNA_TEMP_MIN = 0;
    public static final int COLUNA_TEMP_MAX = 1;

    public static void main(String[] args) {
        String[] cidades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        String cidadeMin = "", cidadeMax = "";
        int tempMin = 0, tempMax = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            if (tempMin > temperaturas[i][COLUNA_TEMP_MIN]) {
                tempMin = temperaturas[i][COLUNA_TEMP_MIN];
                cidadeMin = cidades[i];
            }
            if (tempMax < temperaturas[i][COLUNA_TEMP_MAX]) {
                tempMax = temperaturas[i][COLUNA_TEMP_MAX];
                cidadeMax = cidades[i];
            }
        }

        System.out.printf("A cidade de %s registrou a temperatura mais Baixa de %d°C\n", cidadeMin, tempMin);
        System.out.printf("A cidade de %s registrou a temperatura mais Alta de %d°C\n", cidadeMax, tempMax);
    }
}
