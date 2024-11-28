package org.example;

public class Exercicio2Arrays {
    public static void main(String[] args) {
        int[] numeros = {2,5,9,3,4,1};

        int soma = 0;

        for(var i = 0; i < numeros.length; i++){
            soma = soma + numeros[i];
        }

        System.out.println(soma);
    }
}