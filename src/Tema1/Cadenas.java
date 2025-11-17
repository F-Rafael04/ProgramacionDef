package Tema1;

import java.util.Scanner;

public class Cadenas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre");

        String nombre = scanner.nextLine();

        scanner.close();
        System.out.println("Hola " + nombre);
    }
}
