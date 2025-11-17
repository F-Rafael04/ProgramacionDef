package Tema2.Ejercicios_avanzados;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Pide por teclado dos números y genera 10 números aleatorios entre esos números.
        // Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        System.out.println("\n10 números aleatorios entre " + min + " y " + max + ":");

        for (int i = 0; i < 10; i++) {
            int aleatorio = (int) (Math.random() * (max - min + 1)) + min;
            System.out.println(aleatorio);
        }

        sc.close();
    }
}
