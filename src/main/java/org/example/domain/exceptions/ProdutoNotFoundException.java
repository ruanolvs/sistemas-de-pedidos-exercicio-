package org.example.domain.exceptions;

public class ProdutoNotFoundException extends RuntimeException{
    public ProdutoNotFoundException(String message){
        super(message);
    }
}
