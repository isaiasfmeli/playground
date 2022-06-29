package com.github.isaiasfmeli.playground.modulo2.java3.pi2;

import java.util.HashSet;
import java.util.Set;

public class Garagem {

    private int id;
    private Set<Veiculo> veiculos;

    public Garagem(int id) {
        this.id = id;
        this.veiculos = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Veiculo> getVeiculos() {
        return veiculos;
    }

    public boolean putVeiculo(Veiculo veiculo)
    {
        return getVeiculos().add(veiculo);
    }

    public boolean delVeiculo(Veiculo veiculo)
    {
        return getVeiculos().remove(veiculo);
    }

    public void setVeiculos(Set<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}
