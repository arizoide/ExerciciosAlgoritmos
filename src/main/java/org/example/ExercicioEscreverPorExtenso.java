package org.example;

public class ExercicioEscreverPorExtenso {
    public static void main(String[] args) {

        var numero = 100;

        String[] numeroAte20 = {"zero", "um", "dois", "três", "quatro", "cinco", "seis",
                "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze",
                "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};

        String[] numeroMaior20 = {"vinte", "trinta", "quarenta", "cinquenta",
                "sessenta", "setenta", "oitenta", "noventa", "cem"};

        if(numero < 20) {
            System.out.println(numeroAte20[numero]);
        } else {
            int dezena = numero / 10;
            int unidade = numero % 10;
            if(unidade > 0){
                System.out.println(numeroMaior20[dezena - 2] + " e " + numeroAte20[unidade]);
            } else {
                System.out.println(numeroMaior20[dezena - 2]);
            }
        }

    }
}