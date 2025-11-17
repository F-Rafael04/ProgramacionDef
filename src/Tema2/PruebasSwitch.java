package Tema2;

import java.util.Scanner;

public class PruebasSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Posicion = sc.nextInt();

        switch (Posicion) {

            case 1:
                System.out.println("David");
                break;
            case 2:
                System.out.println("Antonio");
                break;
            default:
                System.out.println("Juan Carlos");

        }
    }
}
