package Tema2.Ejercicios_basicos1;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce numeros y para terminar pon cinco ceros");

        int numero = sc.nextInt();
        int suma = numero;
        int contador = 0;

        while (contador != 5) {
            System.out.println("introduce numeros y para terminar pon cinco ceros");

            numero = sc.nextInt();
            if (numero == 0) {
                contador++;
            }
            suma = suma + numero;
        }
        System.out.println("el total de los numeros sumados es:" + suma);
        sc.close();
    }
}
