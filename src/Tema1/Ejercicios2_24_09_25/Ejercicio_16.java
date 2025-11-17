package Tema1.Ejercicios2_24_09_25;

import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero del que quieras la tabla del multiplicar");
        int num = sc.nextInt();

        int multiplicador = 0;
        System.out.println(multiplicador + " * " + num + " = " + (multiplicador++) * num);
        System.out.println(multiplicador + " * " + num + " = " + (multiplicador++) * num);
        System.out.println(multiplicador + " * " + num + " = " + (multiplicador++) * num);
        System.out.println(multiplicador + " * " + num + " = " + (multiplicador++) * num);
        System.out.println(multiplicador + " * " + num + " = " + (multiplicador++) * num);
        System.out.println(multiplicador + " * " + num + " = " + (multiplicador++) * num);
        System.out.println(multiplicador + " * " + num + " = " + (multiplicador++) * num);
        System.out.println(multiplicador + " * " + num + " = " + (multiplicador++) * num);
        System.out.println(multiplicador + " * " + num + " = " + (multiplicador++) * num);
        System.out.println(multiplicador + " * " + num + " = " + (multiplicador++) * num);
        System.out.println(multiplicador + " * " + num + " = " + (multiplicador++) * num);

        sc.close();
    }
}
