package Tema2;

public class FactorialRecursivo {
    public static void main(String[] args) {
        int fatcorial5 = factorial(5);
        System.out.println("el factorial de 5 es: " + fatcorial5);

    }

    static int factorial(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
}
