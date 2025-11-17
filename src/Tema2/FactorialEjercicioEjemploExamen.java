package Tema2;

import java.util.Scanner;

public class FactorialEjercicioEjemploExamen {
    public static void main(String[] args) {
        // abrimos escaner
        Scanner sc = new Scanner(System.in);

        // precio base
        double prercioBase = 500d;

        System.out.println("Mete tu edad");
        int edad = sc.nextInt();

        //Meter accidentes
        System.out.println("dime si tuviste accidentes true/false");
        boolean accidentes = sc.nextBoolean();

        double precioTotal = calcularTotal(edad, prercioBase, accidentes);
        System.out.println(" el precio de tu seguro es: " + precioTotal);


    }

    static double calcularTotal(int edad, double preciobase, boolean accidentes) {
        if (edad > 18 && edad < 25) {
            return preciobase + preciobase * 0.2d;
        } else if (edad > 35 && edad < 55) {
            if (accidentes == false) {
                return preciobase - preciobase * 0.2d;
            } else {
                return preciobase;
            }
        } else if (edad > 65) {
            if (accidentes == true) {
                return preciobase + preciobase * 0.3;
            } else {
                return preciobase + preciobase * 0.1;
            }
        }
        return preciobase;
    }
}
