package Tema1;

public class PrecioVideojuego {
    public static void main(String[] args) {
        double Ahorros = 100;
        double PrecioVideojego1 = 79.99;

        System.out.println("tengo " + Ahorros + " ahorrrado");
        System.out.println("me voy a comprar un videojuego que cuesta: " + PrecioVideojego1);

        Ahorros = Ahorros - PrecioVideojego1;

        System.out.println("Me queda " + Ahorros);
    }
}
