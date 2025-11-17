package Tema2.EjerciciosArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        //Abro escaner
        Scanner sc = new Scanner(System.in);

        // Pido numero para comprobar cuantas veces aparece
        System.out.println("escribe el numero que quieras saber cuantas veces aparece");

        int num = sc.nextInt();

        // pongo un contador

        int contador = 0;

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

            //Compruebo el numero pedido y lo sumo al contador
            if (numerosAleatorios[i] == num) {
                contador = contador + 1;
            }

        }

        //Escribo los numeros por pantallas
        System.out.println(Arrays.toString(numerosAleatorios));

        //Escribo la cantidad de veces que aparece el numero seleccionado
        System.out.println("El numero: " + num + "aparece esta cantidad de veces: " + contador);

        // cierro escaner
        sc.close();
    }
}
