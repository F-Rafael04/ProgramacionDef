package Tema2;

import java.util.Arrays;

public class PruebaArrays {
    public static void main(String[] args) {
        //Asi se declara un arrays
        //El ultimo corchete es el tamaño del arrays
        int[] notasRafa = new int[3];

        //Relleno las notas
        notasRafa[0] = 7;
        notasRafa[1] = 6;
        notasRafa[2] = 7;

        //Asi se muestra todas las cosas guardadas en el arrays
        System.out.println(Arrays.toString(notasRafa));

        //Asi se hace un nuevo Arrays si se te queda pequeño el anterior
        //Guardamos las notas antiguas en un Arrays auxiliar
        int[] notasRafaAux = notasRafa;

        //declaramos un nuevo Arrays
        notasRafa = new int[4];

        //Hacemos un bucle para copiar las notas de aux al nuevo arrays
        //Ponemos que la i vaya rellenando los arrays para que se vayan copiando
        // para dar las vueltas justas en el bucle ponemos "notasRafaAux.length" para que te cuente las
        // celdas que tiene el arrays
        for (int i = 0; i < notasRafaAux.length; i++) {
            notasRafa[i] = notasRafaAux[i];
        }
        // escribimo la nota nueva para rellenar el nuevo hueco
        notasRafa[3] = 10;

        //escribimos de nuevo por pantalla las notas
        System.out.println(Arrays.toString(notasRafa));

        // ya tenemos lso cuatro datos en la nueva Arrays

        //inicializacion
        //Si hacemos lo siguiente podemos rellenar los campos directamente:
        int[] masNotas = {4, 5, 8, 10};

        System.out.println(Arrays.toString(masNotas));
    }
}
