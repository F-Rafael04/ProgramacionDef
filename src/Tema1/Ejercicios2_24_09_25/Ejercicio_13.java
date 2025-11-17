package Tema1.Ejercicios2_24_09_25;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        //introducir cuantos segundos duro el concierto
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce los segundos que duro el concierto");
        int duracion = sc.nextInt();

        //cerrrar escaner
        sc.close();

        //convertir los segundos en horas y minutos
        int horas = duracion / 3600;
        duracion = duracion % 3600;

        int minutos = duracion / 60;
        duracion = duracion % 60;

        int segundos = duracion;

        //mostrar en horas minutos y segundos

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
