package Tema2;

import java.util.Scanner;

public class PruebasConElSi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce tu edad");
        int edad = sc.nextInt();

        // if encadenado
        if (edad >= 18) {
            if (edad >= 65) {
                System.out.println("Estas jubilado");
            } else {
                System.out.println("eres mayor de edad");
            }
        } else {
            System.out.println("eres menor de edad");
        }

        sc.close();
    }
}
