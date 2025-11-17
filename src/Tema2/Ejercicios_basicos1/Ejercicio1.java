package Tema2.Ejercicios_basicos1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero entero");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("es 0");
        } else if (num < 0) {
            System.out.println("es negativo");
        }
        if (num % 2 == 0) {

            System.out.println("es par");
        } else {
            System.out.println("es impar");
        }
    }
}