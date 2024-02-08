import java.util.ArrayList;
/**
 * Clase QuickSort método para ordenar una lista de enteros utilizando el algoritmo QuickSort.
 */
class QuickSort {
    /**
     * Particiona la lista en dos subconjuntos alrededor de un pivote.
     * @param arr Lista de enteros a ser particionada.
     * @param low Índice más bajo del subconjunto a ser particionado.
     * @param high Índice más alto del subconjunto a ser particionado.
     * @return Índice del pivote después de la partición.
     */
    int partition(ArrayList<Integer> arr, int low, int high) {
        int pivot = arr.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr.get(j) <= pivot) {
                i++;

                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        int temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;
    }
    /**
     * Ordena una lista de enteros utilizando el algoritmo QuickSort.
     * @param arr Lista de enteros a ser ordenada.
     * @param low Índice más bajo del subconjunto a ser ordenado.
     * @param high Índice más alto del subconjunto a ser ordenado.
     */
    void quicksort(ArrayList<Integer> arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }
}