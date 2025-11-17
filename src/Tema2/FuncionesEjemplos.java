package Tema2;

import java.util.Scanner;

public class FuncionesEjemplos {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("escribe la base");
        int base = sc.nextInt();
        System.out.println("escribe la altura");
        int altura = sc.nextInt();

        double area = calculaAreaTriangulo(base, altura);

        System.out.println("el area es: " + area);

    }

    static double calculaAreaTriangulo(int base, int altura) {

        return base * altura / 2d;
    }
}
