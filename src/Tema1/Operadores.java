package Tema1;

public class Operadores {
    public static void main(String[] args) {

        //operadores aritmetricos
        /*
        entrada de numero
        salida de numero
         */
        int Numero1 = 13;

        Numero1 = Numero1 + 2;

        System.out.println("Numero1 vale: " + Numero1);

        Numero1 = Numero1 * 2;

        Numero1 = Numero1 - 50 / 2;

        Numero1 = Numero1 + 5;

        //deberia dar 10
        System.out.println("Numero1 ahora vale: " + Numero1);

        int Numero2 = Numero1 % 3;

        // operadores de asignacion

        int OtroNumero = 3;

        OtroNumero += 2;

        System.out.println("OtroNumero: " + OtroNumero);

        //Operador de incremento

        int edad = 22;
        System.out.println("edad linea1: " + edad);
        edad++;
        System.out.println("edad linea2: " + edad);
        System.out.println("edad linea3: " + edad++);
        System.out.println("edad linea4: " + edad);

        //si pones el ++ a la derecha primero muestra el numero y luego lo suma
        //y si lo pones a la izquierda de la variable suma antes de mostrar.


    }
}
