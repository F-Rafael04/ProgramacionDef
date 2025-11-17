package Tema2.EjerciciosArrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio01 {
    public static void main(String[] args) {
        // declaro el Arrays de 20
        int[] numerosAleatorios = new int[20];

        //empiezo el bucle para rellenar el Arrays
        for (int i = 0; i < numerosAleatorios.length; i++) {
            // Inicio el RNG
            Random r = new Random();

            //Relleno el Arrays con los numeros random del 1 al 10
            //Para usar el RNG es como el Scanner solo que en vez de sc.nextint es la
            // r que declaramos donde la icicalizacio del RNG
            numerosAleatorios[i] = r.nextInt(10);
        }

        //Escribo los numeros por pantallas
        System.out.println(Arrays.toString(numerosAleatorios));
    }
}
