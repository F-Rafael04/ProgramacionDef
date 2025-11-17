package Tema2.EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // implementa un metodo que reciba un nombre y edad y muestre un mensaje personalizado
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        String nom = sc.nextLine();

        System.out.println("escribe tu edad");
        int edad = sc.nextInt();

        mensaje(nom, edad);

        sc.close();
    }

    static void mensaje(String nom, int edad) {
        System.out.println("Hola " + nom + " esta es tu edad " + edad);
    }
}
