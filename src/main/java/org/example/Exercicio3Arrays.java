package org.example;

import java.util.Arrays;

public class Exercicio3Arrays {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        int[] numerosInvertidos = new int[numeros.length];
        System.out.println(Arrays.toString(numeros));

        for(var i = 0; i < numeros.length; i++){
            numerosInvertidos[numeros.length - 1 - i] = numeros[i];
        }

        System.out.println(Arrays.toString(numerosInvertidos));

    }
}