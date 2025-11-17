package Tema2.EjerciciosArrays2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio05 {
    public static void main(String[] args) {
        // declaro de Arrays
        int[] numerosAleatorios = new int[50];
        int[] numerosFaltan = new int[100];
        int[] numeroOrdenados = new int[100];

        for (int i = 0; i<100; i++ ){
            numerosFaltan[i] = i + 1;

        }
        System.out.println(Arrays.toString(numerosFaltan));

        //empiezo el bucle para rellenar el Arrays
        for (int i = 0; i < numerosAleatorios.length; i++) {
            // Inicio el RNG
            Random r = new Random();

            //Relleno el Arrays con los numeros random del 1 al 10
            //Para usar el RNG es como el Scanner solo que en vez de sc.nextint es la
            // r que declaramos donde la icicalizacio del RNG
            numerosAleatorios[i] = r.nextInt(100);
            numerosAleatorios[i] = numerosAleatorios[i] +1;
        }

        //Escribo los numeros por pantallas
        System.out.println(Arrays.toString(numerosAleatorios));


        //Comparo y borro los numeros que se repiten
for (int i = 0; i < 50; i++){
    for (int j = 0; j < 100; j++){
        if (numerosAleatorios[i] == numerosFaltan[j]){
            numerosFaltan[j]= 0;
        }
    }
}
for (int i = 0; i < 100; i++){
    if (numerosFaltan[i] == i){
        numeroOrdenados[i] = numeroOrdenados[i] + i;
    }
}

        System.out.println(Arrays.toString(numerosFaltan));

        System.out.println(Arrays.toString(numeroOrdenados));
    }
}
