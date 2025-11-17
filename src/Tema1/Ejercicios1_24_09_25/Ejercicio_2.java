package Tema1.Ejercicios1_24_09_25;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int C = -125;

        System.out.println("El numero C es: " + ((C >= 0) ? "es positivo" : "es negativo") + ", " + ((C % 2 == 0) ? "Es par" : "Es impar") + ", " + ((C % 5 == 0) ? "es multiplo de 5" : "no es multiplo de 5") + ", " + ((C % 10 == 0) ? "Es multiplo de 10" : "No es multiplo de 10") + " y " + ((C < 100) ? "Es menor de 100" : "Es mayor de 100"));
    }
}
