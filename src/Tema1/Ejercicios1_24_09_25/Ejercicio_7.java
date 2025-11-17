package Tema1.Ejercicios1_24_09_25;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe una velocidad en Km/h");

        double Velocidad = Integer.parseInt(scanner.nextLine());

        System.out.println("La velocidad en m/s es: " + Velocidad / 3.6);

        scanner.close();
    }
}
