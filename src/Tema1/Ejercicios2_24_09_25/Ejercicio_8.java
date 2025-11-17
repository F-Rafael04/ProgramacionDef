package Tema1.Ejercicios2_24_09_25;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un año para saber si es Bisiesto");
        int año = sc.nextInt();

        System.out.println("el año es: " + ((año % 4 == 0) || (año % 400 == 0) ? "es año bisiesto" : "No es año bisiesto"));

        sc.close();
    }
}
