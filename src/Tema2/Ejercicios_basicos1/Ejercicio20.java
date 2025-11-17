package Tema2.Ejercicios_basicos1;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero entero");
        int num = sc.nextInt();
        int aux = num;
        int resultado = 0;

        for (int i = 0; i < 100; i++) {
            aux = aux + 1;
            num = num + aux;

            System.out.println("la suma es:" + num);
        }
        sc.close();
    }
}
