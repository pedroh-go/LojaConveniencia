package com.example.lojaconveniencia;

public class Produto {

    private String nome;
    private double preco;
    private boolean importado;

    public Produto(String nome, double preco, boolean importado){
        this.nome = nome;
        this.preco = preco;
        this.importado = importado;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Nome do Produto: "+nome+
        "\nPreço do Produto: "+preco+
        "\nProduto Importado: "+ (importado ? "Sim":"Não");
    }
}
