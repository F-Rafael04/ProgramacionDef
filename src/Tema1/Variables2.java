package Tema1;

public class Variables2 {
    public static void main(String[] args) {
        // para que un numero sea considerado long debe tener una L al final
        long dinero = 1000000000000000000L;

        // para poner un float debes poner una f al final
        float saldo = 12345.89f;

        System.out.println("Dinero: " + dinero);

        System.out.println("Saldo: " + saldo);

        // las variables grandes entran en las pequeñas pero no las pequeñas en las grades no
        double numero = 457.24f;

        System.out.println(numero);

        // en int no caben decimales
        int Numero1 = 123;

        System.out.println("Numero1: " + Numero1);

        double Numero2 = 123;

        System.out.println("Numero2: " + Numero2);

        final int NotaFinDeCurso;
        double examen1 = 7.8;
        double examen2 = 5.4;
        double media = (examen1 + examen2) / 2;

        System.out.println("la nota media es: " + media);

        //Perder la parte decimal de un doube para un int
        //como se hace? poner el nombre de la variable = (int)
        NotaFinDeCurso = (int) media;

        System.out.println("Nota final es: " + NotaFinDeCurso);

        //Variable Char (caracteres)

        char inicial = 'R';

        System.out.println("Mi inicial es: " + (byte) inicial);
    }
}
