package EjercicioArrays;

import java.util.Arrays;


public class Ejercicio09 {

        public static void main(String[] args) {

            int[] a = {1, 4, 7, 10, 15};
            int[] b = {2, 3, 6, 8, 20};

            int[] resultado = mezclarOrdenados(a, b);

            System.out.println("Array mezclado: " + Arrays.toString(resultado));
        }

        public static int[] mezclarOrdenados(int[] a, int[] b) {
            int n = a.length;
            int m = b.length;

            int[] mezcla = new int[n + m];
            int i = 0, j = 0, k = 0;

            // Mezcla ordenada
            while (i < n && j < m) {
                if (a[i] <= b[j]) {
                    mezcla[k++] = a[i++];
                } else {
                    mezcla[k++] = b[j++];
                }
            }

            // Copiar lo que queda del array a (si queda)
            while (i < n) {
                mezcla[k++] = a[i++];
            }

            // Copiar lo que queda del array b (si queda)
            while (j < m) {
                mezcla[k++] = b[j++];
            }

            return mezcla;
        }
    }

