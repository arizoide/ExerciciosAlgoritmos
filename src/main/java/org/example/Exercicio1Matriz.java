package org.example;

import java.util.Scanner;

public class Exercicio1Matriz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (var linha = 0; linha < 3; linha++){
            for (var coluna = 0; coluna < 3; coluna++){
                System.out.println("Informe um número inteiro");
                matriz[linha][coluna] = s.nextInt();
            }
        }

        var soma = 0;
        for (var linha = 0; linha < 3; linha++) {
            for (var coluna = 0; coluna < 3; coluna++) {
                soma = soma + matriz[linha][coluna];
            }
        }

        System.out.println("Soma da matriz = " + soma);

    }
}
