import java.util.ArrayList;
/**
 * Clase CocktailSort método para ordenar una lista de enteros utilizando el algoritmo CocktailSort.
 */
class CocktailSort {
    /**
     * Ordena una lista de enteros utilizando el algoritmo CocktailSort.
     * @param arr Lista de enteros a ser ordenada.
     */
    void cocktailSort(ArrayList<Integer> arr) {
        boolean swapped = true;
        int start = 0;
        int end = arr.size();

        while (swapped) {
            swapped = false;

            for (int i = start; i < end - 1; ++i) {
                if (arr.get(i) > arr.get(i + 1)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, temp);
                    swapped = true;
                }
            }

            if (!swapped)
                break;

            swapped = false;

            end = end - 1;

            for (int i = end - 1; i >= start; i--) {
                if (arr.get(i) > arr.get(i + 1)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, temp);
                    swapped = true;
                }
            }

            start = start + 1;
        }
    }
}