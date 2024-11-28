package org.example;

public class Exercicio1Arrays {
    public static void main(String[] args) {
        int[] numeros = {2,5,9,3,4,1};

        int maior = numeros[0];
        int menor = numeros[0];

        for(var i = 0; i < numeros.length; i++){
            if(numeros[i] > maior) {
                maior = numeros[i];
            }

            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }

        System.out.println(maior);
        System.out.println(menor);
    }
}