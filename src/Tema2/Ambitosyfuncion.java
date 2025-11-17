package Tema2;

public class Ambitosyfuncion {
    public static void main(String[] args) {
        int edad = 74;

        if (edad > 65) {
            System.out.println(" Enhirabuena estas jubilado su billete a benidor");

            float pension = calculamelapension(edad);
            System.out.println("su pension es de " + pension);
            System.out.println(edad);
        }

        //no se puede
        // sout pension
    }

    static float calculamelapension(int edad) {
        edad++;
        return edad * 24;
    }


}
