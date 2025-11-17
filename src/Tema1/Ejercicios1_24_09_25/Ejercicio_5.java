package Tema1.Ejercicios1_24_09_25;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe tu direccion");

        String direccion = scanner.nextLine();

        System.out.println("Escribe tu numero de telefono");

        int Numero = scanner.nextInt();

        System.out.println("Tu direccion es: " + direccion);

        System.out.println("Tu numero de telefono es: " + Numero);

        scanner.close();
    }
}
