package Tema1.Ejercicios1_24_09_25;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" escribe un numero");

        int Numero = scanner.nextInt();

        System.out.println("Este es el numero que has escrito: " + Numero);

        System.out.println("Este es el doble de tu numero: " + (Numero * 2));

        System.out.println("Este es el triple de tu numero: " + (Numero * 3));
    }
}
