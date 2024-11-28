package org.example;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = {{0,1,2},
                         {3,4,5}};

        System.out.println(matriz[1][0]);

        String[][] hortifruti = {{"acerola","maçã","jaboticaba","figo"},
                                 {"manga","banana","laranja","limão"}};

        for(var linhas = 0; linhas < hortifruti.length;linhas++){
            for(var colunas = 0; colunas < hortifruti[linhas].length;colunas++){
                System.out.println(hortifruti[linhas][colunas]);
            }
        }
    }
}
