package Tema1.Ejercicios2_24_09_25;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una letra");

        char letra = sc.next().charAt(0);

        System.out.println("Tu letra es: " + (Character.isUpperCase(letra) ? "mayuscula" : "minuscula"));

        sc.close();
    }
}
