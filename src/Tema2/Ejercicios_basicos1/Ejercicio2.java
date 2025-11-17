package Tema2.Ejercicios_basicos1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("escribe un numero");

        int num1 = sc.nextInt();

        System.out.println("escribe otro numero");

        int num2 = sc.nextInt();

        System.out.println("escribe un numero mas");

        int num3 = sc.nextInt();

        if (num1 == num2 && num1 == num3) {
            System.out.println("Son iguales los tres");
        } else if (num1 == num2 && num1 > num3) {


        }
    }
}
