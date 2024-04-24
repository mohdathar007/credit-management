package com.athar.creditmanagement.exceptions;



public class NotFoundException extends RuntimeException{

    public NotFoundException(String s) {
        super(s + " bulunamadı!");
    }
}