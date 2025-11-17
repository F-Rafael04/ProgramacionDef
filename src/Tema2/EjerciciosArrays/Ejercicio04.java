package Tema2.EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        //Abro escaner
        Scanner sc = new Scanner(System.in);

        //Introduzco cuantos datos se van a introducir
        System.out.println("cuantos datos vas a meter");
        int cantidadDatos = sc.nextInt();

        //Declaramos los Arrayses
        String[] nombres = new String[cantidadDatos];

        int[] telefonos = new int[cantidadDatos];

        //Bucle para introducir los datos
        for (int i = 0; i < cantidadDatos; i++) {
            System.out.println("escribe el nombre");
            String nombre = sc.next();
            nombres[i] = nombre;

            System.out.println("ahora escribe el numero");
            telefonos[i] = sc.nextInt();

            System.out.println("Nombre: " + nombres[i] + " Telefono: " + telefonos[i]);
        }
        //Se cierra el escaner
        sc.close();
    }
}
