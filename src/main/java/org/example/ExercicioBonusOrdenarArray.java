package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExercicioBonusOrdenarArray {
    public static void main(String[] args) {
        int[] numeros = {3,1,4};

//        Arrays.sort(numeros);
//        System.out.println(Arrays.toString(numeros));

        int ordenar = 0;

        for(int x = 0; x < numeros.length; x++){
            for(int z = 0; z < numeros.length; z++){
                if(numeros[x] < numeros[z]){
                    ordenar = numeros[x];
                    numeros[x] = numeros[z];
                    numeros[z] = ordenar;
                }
            }
        }

        System.out.println(Arrays.toString(numeros));
    }
}