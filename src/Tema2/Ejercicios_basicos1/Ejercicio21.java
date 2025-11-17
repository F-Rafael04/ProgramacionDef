package Tema2.Ejercicios_basicos1;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("pon el numero de cantidad de numeros que vas a hacer la media");
        int cantidad = sc.nextInt();
        double suma = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("escribe un numero para la media");
            double numeros = sc.nextDouble();

            suma = suma + numeros;
        }
        System.out.println("la media es: " + suma / cantidad);

        sc.close();

    }
}
