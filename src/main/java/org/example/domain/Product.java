package org.example.domain;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = validName(name);
        this.price = validPrice(price);
    }
    public String validName(String nome){
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("nome invalido, nao pode ser nulo nem vazio");
        }
        return nome;
    }
    public Double validPrice(Double price){
        if (price < 0){
            throw new IllegalArgumentException("valor nao pode ser negatvo");
        }
        return price;
    }

    public String getName() {
        return name;
    }

    public Product setNome(String nome) {
        this.name = name;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Product setPrice(Double price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Product" +
                "nome='" + name + '\'' +
                ", preco= €" + price;
    }
}
