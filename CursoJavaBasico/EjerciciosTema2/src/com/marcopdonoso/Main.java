package com.marcopdonoso;

public class Main {
    public static void main(String[] args) {

        double price = 45.99;
        double priceTaxesIncluded = includeTaxes(price);

        System.out.println("El precio sin IVA es: " + price);
        System.out.println("El precio con IVA es: " + priceTaxesIncluded);
    }

    private static double includeTaxes(double price) {
        return price * 1.13;
    }
}

