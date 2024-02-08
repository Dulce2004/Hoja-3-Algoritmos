import java.util.ArrayList;
import java.util.Arrays;

/**
 * Clase RadixSort métodos para ordenar una lista de enteros utilizando el algoritmo de ordenación de radix.
 */
class RadixSort {
    /**
     * Obtiene el valor máximo de la lista.
     * @param arr Lista de enteros.
     * @param n Tamaño de la lista.
     * @return El valor máximo de la lista.
     */
    static int getMax(ArrayList<Integer> arr, int n) {
        int mx = arr.getFirst();
        for (int i = 1; i < n; i++)
            if (arr.get(i) > mx)
                mx = arr.get(i);
        return mx;
    }
    /**
     * Ordena la lista utilizando el método de ordenación de conteo para un dígito específico 
     * @param arr Lista de enteros.
     * @param n Tamaño de la lista.
     * @param exp Valor del dígito en el que se está ordenando 
     */
    static void countSort(ArrayList<Integer> arr, int n, int exp) {
        int[] output = new int[n];
        int i;
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < n; i++)
            count[(arr.get(i) / exp) % 10]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = n - 1; i >= 0; i--) {
            output[count[(arr.get(i) / exp) % 10] - 1] = arr.get(i);
            count[(arr.get(i) / exp) % 10]--;
        }

        for (i = 0; i < n; i++)
            arr.set(i, output[i]);
    }
    /**
     * Ordena la lista utilizando el algoritmo de ordenación de radix.
     * @param arr Lista de enteros.
     * @param n Tamaño de la lista.
     */
    static void radixsort(ArrayList<Integer> arr, int n) {
        int m = getMax(arr, n);

        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }
}