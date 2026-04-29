package org.example.domain;

public class Product {
    private String nome;
    private Double preco;

    public Product(String nome, Double preco) {
        this.nome = validarNome(nome);
        this.preco = validarPreco(preco);
    }
    public String validarNome(String nome){
        if (nome.toLowerCase().isBlank()){
            throw new IllegalArgumentException("nome invalido, nao pode ser nulo nem vazio");
        }
        return nome;
    }
    public Double validarPreco(Double preco){
        if (preco < 0){
            throw new IllegalArgumentException("valor nao pode ser negatvo");
        }
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public Product setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Double getPreco() {
        return preco;
    }

    public Product setPreco(Double preco) {
        this.preco = preco;
        return this;
    }

    @Override
    public String toString() {
        return "Product" +
                "nome='" + nome + '\'' +
                ", preco= €" + preco;
    }
}
