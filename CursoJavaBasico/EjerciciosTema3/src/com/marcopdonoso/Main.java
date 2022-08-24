package com.marcopdonoso;

public class Main {
    public static void main(String[] args) {
        String[] textos = {"No","por","madrugar","todos","los","días","amanece","más","temprano"};
        String textoConcatenado = "";

        for (String texto : textos) {
            textoConcatenado += texto + " ";
        }

        System.out.println(textoConcatenado);
    }
}
