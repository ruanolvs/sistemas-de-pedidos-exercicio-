package org.example.application;

import org.example.domain.Order;
import org.example.domain.Product;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {


        Product p1 = new Product("notebook",1900.00);
        Product p2 = new Product("fone",19.00);
        Product p3 = new Product("teclado",199.00);
        Product p4 = new Product("mouse",10.00);
        Product p5 = new Product("tv",100.00);

        Order order1 = new Order("QRU-111");
        Order order2 = new Order("QRU-222");

        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.addProduct(p3);

        System.out.println(order1);

        order2.addProduct(p4);
        order2.addProduct(p5);

        System.out.println(order2);

        order1.removeProduct(p1);

        System.out.println(order1);

        Map<String,Order> pedido = new HashMap<>();

        pedido.put("QRU-111",order1);
        
        pedido.forEach((key,value) -> System.out.println("chave: " + key + "| pedido: " + value));





    }
}