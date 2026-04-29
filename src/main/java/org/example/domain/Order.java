package org.example.domain;

import org.example.domain.exceptions.ProdutoNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<Product> products = new ArrayList<>();
    private String status = "PENDING";

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public Order() {

    }

    public void addProduct (Product prod){
        products.add(prod);
    }
    public void removeProduct(Product prod){
        if (!products.remove(prod)){
            throw new ProdutoNotFoundException("produto com id:" + prod.getName() + " nao encontrado");
        }
            System.out.println("produto: " + prod + " removido com sucesso");

    }
    public Double getPriceTotal(){
       return products.stream().mapToDouble(Product :: getPrice).sum();


    }

    @Override
    public String toString() {
        return "Id='" + orderId + '\'' +
                ", status='" + status + '\''+
                " total: " + getPriceTotal();
    }
}
