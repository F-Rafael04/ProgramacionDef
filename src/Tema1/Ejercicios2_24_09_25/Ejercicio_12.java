package Tema1.Ejercicios2_24_09_25;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un precio");

        double precio = sc.nextDouble();

        final double IVA = 1 + 0.21;

        System.out.println("el precio con IVA es: " + (IVA * precio));

        sc.close();
    }
}
