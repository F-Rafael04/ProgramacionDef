package Tema2;

import java.util.Scanner;

public class PruebasCocacolaSi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu dinero");

        double Dinero = sc.nextDouble();

        if (Dinero >= 2) {
            if (Dinero >= 5) {
                if (Dinero >= 7) {
                    System.out.println("me puedo comprar una cocacola y un bocadillo");
                } else {
                    System.out.println("me puedo comprar una botella de agua y un bocadillo");
                }
            } else {
                System.out.println("me puedo comprar una cocacola");
            }
        } else {
            System.out.println(" Soy pobre me compro un agua :'(");
        }

        sc.close();
    }
}
