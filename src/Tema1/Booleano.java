package Tema1;

public class Booleano {
    public static void main(String[] args) {

        // necesita los dos boolean en true para true
        // Variable && Variable
        boolean tiempoLibre = true;

        boolean Dinero = true;

        System.out.println(tiempoLibre && Dinero);

        boolean DineroEfectivo = true;

        boolean DineroTarjeta = false;

        // para solo necesitar un true se usa || entre las variables
        System.out.println("¿Puedo pagar? " + (DineroEfectivo || DineroTarjeta));
    }
}
