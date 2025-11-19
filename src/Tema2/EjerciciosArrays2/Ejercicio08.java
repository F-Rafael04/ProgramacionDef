package EjercicioArrays;

public class Ejercicio08 {

        public static void main(String[] args) {

            int[][] matriz = {
                    {17, 24, 1, 8, 15},
                    {23, 5, 7, 14, 16},
                    {4, 6, 13, 20, 22},
                    {10, 12, 19, 21, 3},
                    {11, 18, 25, 2, 9}
            };

            if (esCuadroMagico(matriz)) {
                System.out.println("La matriz es un cuadro mágico.");
            } else {
                System.out.println("La matriz NO es un cuadro mágico.");
            }
        }

        public static boolean esCuadroMagico(int[][] m) {

            int n = m.length;

            // Comprobación básica
            for (int[] fila : m) {
                if (fila.length != n) {
                    return false; // no es cuadrada
                }
            }

            // Suma objetivo = suma de la primera fila
            int sumaObjetivo = 0;
            for (int j = 0; j < n; j++) {
                sumaObjetivo += m[0][j];
            }

            // Verificar filas
            for (int i = 1; i < n; i++) {
                int sumaFila = 0;
                for (int j = 0; j < n; j++) {
                    sumaFila += m[i][j];
                }
                if (sumaFila != sumaObjetivo) {
                    return false;
                }
            }

            // Verificar columnas
            for (int j = 0; j < n; j++) {
                int sumaCol = 0;
                for (int i = 0; i < n; i++) {
                    sumaCol += m[i][j];
                }
                if (sumaCol != sumaObjetivo) {
                    return false;
                }
            }

            // Verificar diagonal principal
            int sumaDiagonal1 = 0;
            for (int i = 0; i < n; i++) {
                sumaDiagonal1 += m[i][i];
            }
            if (sumaDiagonal1 != sumaObjetivo) {
                return false;
            }

            // Verificar diagonal secundaria
            int sumaDiagonal2 = 0;
            for (int i = 0; i < n; i++) {
                sumaDiagonal2 += m[i][n - 1 - i];
            }
            if (sumaDiagonal2 != sumaObjetivo) {
                return false;
            }

            return true;
        }
    }