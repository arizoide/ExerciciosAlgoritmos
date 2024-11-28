package org.example;

import java.util.Scanner;

public class JogoDaVelha {

    static String jogo[][] = {  {"-","-","-"},
                                {"-","-","-"},
                                {"-","-","-"}};

    static int contadorPosicoesVazias = 0;


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do primeiro jogador, que será o X");
        var jogadorX = s.next();
        System.out.println("Digite o nome do segundo jogador, que será o O");
        var jogadorO = s.next();

        jogo = new String[][]{  {"-", "-", "-"},
                                {"-", "-", "-"},
                                {"-", "-", "-"}};

        contadorPosicoesVazias = 9;

        boolean terminou = false;

        do {
            if(contadorPosicoesVazias == 0) {
                terminou = true;
            }
            //Jogador X
            int colunaJogadorX = 0;
            int linhaJogadorX = 0;
            do {
                System.out.println("Jogador X, digite a coluna da jogada (1, 2 ou 3)");
                colunaJogadorX= s.nextInt();
                System.out.println("Jogador X, digite a linha da jogada (1, 2 ou 3)");
                linhaJogadorX= s.nextInt();
            }while(!jogo[linhaJogadorX-1][colunaJogadorX-1].equals("-"));
            jogo[linhaJogadorX-1][colunaJogadorX-1] = "X";

            imprimirJogo();

            if(!terminou) {
                //Jogador O
                int colunaJogadorO = 0;
                int linhaJogadorO = 0;
                do {
                    System.out.println("Jogador O, digite a coluna da jogada (1, 2 ou 3)");
                    colunaJogadorO = s.nextInt();
                    System.out.println("Jogador O, digite a linha da jogada (1, 2 ou 3)");
                    linhaJogadorO = s.nextInt();
                } while (!jogo[linhaJogadorO - 1][colunaJogadorO - 1].equals("-"));
                jogo[linhaJogadorO - 1][colunaJogadorO - 1] = "O";
            }

            imprimirJogo();

            terminou = verificarSeTerminou();

        } while(!terminou);
    }

    public static void imprimirJogo(){
        for(var linha = 0; linha < 3; linha++){
            for (var coluna = 0; coluna < 3; coluna++){
                System.out.print(jogo[linha][coluna]);
                if(!jogo[linha][coluna].equals("-")){
                    contadorPosicoesVazias--;
                }
                System.out.print("|");
            }
            System.out.println("\n");
        }
    }

    public static boolean verificarSeTerminou(){
        // Verifica as linhas
        for (int i = 0; i < 3; i++) {
            if (jogo[i][0].equals(jogo[i][1]) && jogo[i][1].equals(jogo[i][2]) && !jogo[i][0].equals("-")) {
                System.out.println("O jogador " + jogo[i][0] + " ganhou");
                return true;
            }
        }

        // Verifica as colunas
        for (int i = 0; i < 3; i++) {
            if (jogo[0][i].equals(jogo[1][i]) && jogo[1][i].equals(jogo[2][i]) && !jogo[0][i].equals("-")) {
                System.out.println("O jogador " + jogo[0][i] + " ganhou");
                return true;
            }
        }

        // Verifica a diagonal principal
        if (jogo[0][0].equals(jogo[1][1]) && jogo[1][1].equals(jogo[2][2]) && !jogo[0][0].equals("-")) {
            System.out.println("O jogador " + jogo[0][0] + " ganhou");
            return true;
        }

        // Verifica a diagonal secundária
        if (jogo[0][2].equals(jogo[1][1]) && jogo[1][1].equals(jogo[2][0]) && !jogo[0][2].equals("-")) {
            System.out.println("O jogador " + jogo[0][2] + " ganhou");
            return true;
        }

        return false;
    }
}
