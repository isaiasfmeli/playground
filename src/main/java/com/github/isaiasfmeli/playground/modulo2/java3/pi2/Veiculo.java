package com.github.isaiasfmeli.playground.modulo2.java3.pi2;

public class Veiculo {

    private String modelo;
    private Veiculo.Marca marca;
    private int preco;

    public Veiculo(String modelo, Marca marca, int preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString()
    {
        return String.format("veiculo:{modelo:%s,marca:%s,preco:%d}",
            this.getModelo(),
            this.getMarca(),
            this.getPreco());
    }

    public static enum Marca
    {
        FORD("Ford"),
        FIAT("Fiat"),
        CHEVROLET("Chevrolet"),
        TOYOTA("Toyota"),
        RENAULT("Renault");

        private String nome;
        Marca(String nome)
        {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
    }
}
