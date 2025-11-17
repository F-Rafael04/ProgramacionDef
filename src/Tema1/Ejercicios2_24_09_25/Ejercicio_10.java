package Tema1.Ejercicios2_24_09_25;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        //introducir numeros
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero para comprobar su orden");
        int num1 = sc.nextInt();

        System.out.println("introduce el segundo numero para comprobar su orden");
        int num2 = sc.nextInt();

        System.out.println("introduce un tercer numero para comprobar su orden");
        int num3 = sc.nextInt();

        //cerrar el escaner
        sc.close();

        //mostar si estan ordenados

        System.out.println("numeros: " + num1 + ", " + num2 + ", " + num3);
        System.out.println(((num1 < num2) && (num2 < num3)) ? "estan ordenados" : "no estan ordenados");
    }
}
