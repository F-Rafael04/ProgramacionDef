package Tema2.Ejercicios_basicos1;

public class Ejercicio18 {
    public static void main(String[] args) {

        long aux = 1;
        long aux2 = 1;
        for (int i = 0; i < 20; i++) {

            aux = (aux * aux2);

            aux2++;
        }
        System.out.println("La multiplicacion de los primeros 20 numeros naturales es:" + aux);
    }
}
