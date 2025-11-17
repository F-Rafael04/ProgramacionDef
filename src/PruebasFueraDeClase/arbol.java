package PruebasFueraDeClase;

public class arbol {
    public static void main(String[] args) {
        int height = 7; // Altura del árbol

        // Parte del árbol (triángulo)
        for (int i = 1; i <= height; i++) {
            // Espacios en blanco antes de los asteriscos
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Asteriscos para formar el árbol
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Tronco del árbol
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < height - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
