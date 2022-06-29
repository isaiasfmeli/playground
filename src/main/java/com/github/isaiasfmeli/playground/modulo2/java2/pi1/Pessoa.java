package com.github.isaiasfmeli.playground.modulo2.java2.pi1;

public class Pessoa {

    private String ID;
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String ID, String nome, int idade, double peso, double altura) {
        this.ID = ID;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa(String ID, String nome) {
        this.ID = ID;
        this.nome = nome;
    }

    public Pessoa() {
        //
    }

    public String getID() {
        return this.ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return String.format("pessoa:{nome:%s,idade:%d,peso:%f,altura:%f}",
                this.getNome(),
                this.getIdade(),
                this.getPeso(),
                this.getAltura()
        );
    }
}
