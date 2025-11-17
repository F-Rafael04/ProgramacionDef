package Tema1.Ejercicios2_24_09_25;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cantidad de dinero en entero");
        int cantidad = sc.nextInt();

        int b500 = cantidad / 500;
        cantidad = cantidad % 500;

        int b200 = cantidad / 200;
        cantidad = cantidad % 200;

        int b100 = cantidad / 100;
        cantidad = cantidad % 100;

        int b50 = cantidad / 50;
        cantidad = cantidad % 50;

        int b20 = cantidad / 20;
        cantidad = cantidad % 20;

        int b10 = cantidad / 10;
        cantidad = cantidad % 10;

        int b5 = cantidad / 5;
        cantidad = cantidad % 5;

        System.out.println("Billetes de 500: " + b500);
        System.out.println("Billetes de 200: " + b200);
        System.out.println("Billetes de 100: " + b100);
        System.out.println("Billetes de 50: " + b50);
        System.out.println("Billetes de 20: " + b20);
        System.out.println("Billetes de 10: " + b10);
        System.out.println("Billetes de 5: " + b5);

        sc.close();
    }
}
