package com.github.isaiasfmeli.playground.modulo2.java3.pi1;

public class ContaExecutivos extends Conta {

    private double limite;

    public ContaExecutivos(int id, int limite) {
        super(id);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double saque){
        if(saque <= getSaldo() + limite)
        {
            return super.sacar(saque);
        }
        return false;
    }
}
