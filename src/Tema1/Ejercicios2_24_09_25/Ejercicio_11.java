package Tema1.Ejercicios2_24_09_25;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("escribe el radio de un circulo");

        double Radio = sc.nextDouble();

        System.out.println("La longitud de tu circulo es: " + ((2 * 3.14) * Radio));

        System.out.println("El area del circulo con tu radio es:" + ((Radio * Radio) * 3.14));

        sc.close();


    }
}
