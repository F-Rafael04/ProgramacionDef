package Tema2.EjerciciosArraysDeArrayses;

import java.util.Arrays;

public class Ejercicio01 {
    public static void main(String[] args) {
        int[] primeraFila = {1, 2, 3};
        int[] segundaFila = {4, 5, 6};

        int[][] todoSinVer = {primeraFila, segundaFila};

        for (int[] todo : todoSinVer) {
            System.out.println(Arrays.toString(todo));
        }
    }
}
