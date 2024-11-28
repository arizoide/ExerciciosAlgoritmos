package org.example;

public class Exercicio4Arrays {
    public static void main(String[] args) {


        int[] elementos = {2,2,3,5};

        int contador = 0;

        for (int elemento : elementos){
            for (int verificacao : elementos){
                if(elemento == verificacao){
                    contador++;
                }
            }

            if(contador >= 2) {
                System.out.println("Elemento duplicado: " + elemento);
            }
            contador = 0;
        }

    }
}