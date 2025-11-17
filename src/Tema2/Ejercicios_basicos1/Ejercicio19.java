package Tema2.Ejercicios_basicos1;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("escribe un numero entero");

        int numero = sc.nextInt();

        System.out.println("Números impares menores que " + numero + ":");

        for (int i = 1; i < numero; i += 2) {
            System.out.println(i);
        }
        sc.close();
    }
}
