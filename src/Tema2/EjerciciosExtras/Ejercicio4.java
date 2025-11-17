package Tema2.EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // escribe un metodo para calcular el area de un rectangulo dados base y altura

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la base");
        int base = sc.nextInt();

        System.out.println("escribe la altura");
        int altura = sc.nextInt();

        int area = calculoarea(base, altura);
        System.out.println("El area es " + area);

        sc.close();

    }

    static int calculoarea(int base, int altura) {
        return base * altura;
    }
}
