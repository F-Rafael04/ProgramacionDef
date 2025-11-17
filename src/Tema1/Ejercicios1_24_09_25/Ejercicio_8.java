package Tema1.Ejercicios1_24_09_25;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero de 3 cifras");

        int Numero = Integer.parseInt(scanner.nextLine());

        int centenas = Numero / 100;
        int decenas = (Numero / 10) % 10;
        int unidades = Numero % 10;

        System.out.println("centenas:" + centenas + " decenas:" + decenas + "unidades:" + unidades);
    }
}
