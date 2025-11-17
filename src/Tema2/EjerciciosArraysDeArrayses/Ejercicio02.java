package Tema2.EjerciciosArraysDeArrayses;

import java.util.Arrays;

public class Ejercicio02 {
    public static void main(String[] args) {
        int[][] numb = new int[2][3];
        int k = 1;

        for (int i = 0; i < numb.length; i++) {
            for (int j = 0; j < numb[i].length; j++) {
                numb[i][j] = k++;
            }
        }

        for (int[] num : numb) {
            System.out.println(Arrays.toString(num));
        }
    }

}
