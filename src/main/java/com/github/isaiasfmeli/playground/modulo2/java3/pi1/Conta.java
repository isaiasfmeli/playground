package com.github.isaiasfmeli.playground.modulo2.java3.pi1;

public abstract class Conta {

    private int id;
    private double saldo;

    public Conta(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return this.id;
    }

    public double getSaldo()
    {
        return this.saldo;
    }

    public boolean depositar(double deposito){
        this.saldo += deposito;
        return true;
    }

    public boolean sacar(double saque)
    {
        this.saldo -= saque;
        return true;
    }

}
