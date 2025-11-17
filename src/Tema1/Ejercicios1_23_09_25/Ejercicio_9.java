package Tema1.Ejercicios1_23_09_25;

public class Ejercicio_9 {
    public static void main(String[] args) {

        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int AUX;

        AUX = B;

        B = C;

        C = A;

        A = D;

        D = AUX;

        System.out.println("A " + A);

        System.out.println("B " + B);

        System.out.println("C " + C);
        System.out.println("D " + D);
    }
}
