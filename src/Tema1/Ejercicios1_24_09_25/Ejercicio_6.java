package Tema1.Ejercicios1_24_09_25;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("escribe un numero");
        int Numero1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Escribe otro numero");
        int Numero2 = Integer.parseInt(scanner.nextLine());

        System.out.println("El primer numero es: " + Numero1 + " y el segundo numero es: " + Numero2);

        scanner.close();
    }
}
