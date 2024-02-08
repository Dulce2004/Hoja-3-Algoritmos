import java.util.ArrayList;
/**
 * Clase MergeSort método para ordenar una lista de enteros utilizando el algoritmo MergeSort.
 */
class MergeSort {
    /**
     * Fusiona dos subconjuntos de una lista ordenada en un solo subconjunto ordenado.
     * @param arr Lista de enteros a ser fusionada.
     * @param l Índice más bajo del primer subconjunto.
     * @param m Índice medio que divide los dos subconjuntos.
     * @param r Índice más alto del segundo subconjunto.
     */
    void merge(ArrayList<Integer> arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        ArrayList<Integer> L = new ArrayList<>(n1);
        ArrayList<Integer> R = new ArrayList<>(n2);

        for (int i = 0; i < n1; ++i)
            L.add(i, arr.get(l + i));
        for (int j = 0; j < n2; ++j)
            R.add(j, arr.get(m + 1 + j));

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L.get(i) <= R.get(j)) {
                arr.set(k, L.get(i));
                i++;
            } else {
                arr.set(k, R.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr.set(k, L.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            arr.set(k, R.get(j));
            j++;
            k++;
        }
    }
    /**
     * Ordena recursivamente una lista de enteros utilizando el algoritmo MergeSort.
     * @param arr Lista de enteros a ser ordenada.
     * @param l Índice más bajo de la lista a ser ordenada.
     * @param r Índice más alto de la lista a ser ordenada.
     */
    void mergesort(ArrayList<Integer> arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            mergesort(arr, l, m);
            mergesort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }
}