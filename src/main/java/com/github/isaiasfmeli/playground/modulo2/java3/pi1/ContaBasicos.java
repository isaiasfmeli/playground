package com.github.isaiasfmeli.playground.modulo2.java3.pi1;

public class ContaBasicos extends Conta {

    public ContaBasicos(int id) {
        super(id);
    }

    @Override
    public boolean sacar(double saque){
        if(saque <= getSaldo())
        {
            return super.sacar(saque);
        }
        return false;
    }

}
