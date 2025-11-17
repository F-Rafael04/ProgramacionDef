package Tema2.Ejercicios_basicos1;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.print("Introduce un número entre 0 y 9999: ");
            numero = sc.nextInt();
        } while (numero < 0 || numero > 9999);

        // Contar cuántas cifras tiene
        int cifras = 0;
        int temp = numero;

        if (temp == 0) {
            cifras = 1;
        } else {
            while (temp > 0) {
                temp /= 10;
                cifras++;
            }
        }

        // Extraer cifras
        int d1 = -1, d2 = -1, d3 = -1, d4 = -1;

        if (cifras == 1) {
            d1 = numero;
        } else if (cifras == 2) {
            d1 = numero / 10;
            d2 = numero % 10;
        } else if (cifras == 3) {
            d1 = numero / 100;
            d2 = (numero / 10) % 10;
            d3 = numero % 10;
        } else if (cifras == 4) {
            d1 = numero / 1000;
            d2 = (numero / 100) % 10;
            d3 = (numero / 10) % 10;
            d4 = numero % 10;
        }

        // Verificar si es capicúa con if
        boolean esCapicua = false;

        if (cifras == 1) {
            esCapicua = true;
        } else if (cifras == 2 && d1 == d2) {
            esCapicua = true;
        } else if (cifras == 3 && d1 == d3) {
            esCapicua = true;
        } else if (cifras == 4 && d1 == d4 && d2 == d3) {
            esCapicua = true;
        }

        // Mostrar resultado
        if (esCapicua) {
            System.out.println("El número " + numero + " es capicúa.");
        } else {
            System.out.println("El número " + numero + " no es capicúa.");
        }

        sc.close();
    }
}
