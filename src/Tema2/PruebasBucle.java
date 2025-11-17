package Tema2;

import java.util.Scanner;

public class PruebasBucle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // bucle for
        // variable;condicion;lo que te saca del bucle
        //for incrementa despues del bucle aunque el numero este arriba
        //y se para cuando la condicion no se cumple y ese bucle ya no sigue

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //bucle while
        //es libre pero te tienes que asegurar de que lo terminas

        int numero = 0;
        while (numero < 5) {
            System.out.println(numero);
            numero = numero + 1;
        }
        
        // do... while
        // similar a While pero se ejecuta si o si una vez

        int numero2 = 1;
        do {
            System.out.println("escribe un numero y te doy el doble");

            numero2 = sc.nextInt();

            System.out.println("el doble de " + numero2 + " es " + (numero2 * 2));

        } while (numero2 != 0);
    }
}
