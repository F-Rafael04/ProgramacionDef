package Tema1.Ejercicios2_24_09_25;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        //introducir tu peso
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu peso");
        double peso = sc.nextDouble();

        //hallar tu masa
        double masa = peso / 9.8;

        // hallar tu peso en la luna y mostrarlo
        System.out.println("Tu peso en la luna es:" + (masa * 1.62));

        //fin
        sc.close();

    }
}
