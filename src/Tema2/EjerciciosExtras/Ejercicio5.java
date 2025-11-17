package Tema2.EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Escribe el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Escribe el tercer numero");
        int num3 = sc.nextInt();
        int mayor = calcularmayor(num1, num2, num3);
        System.out.println("el mayor es: " + mayor);

    }

    static int calcularmayor(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
