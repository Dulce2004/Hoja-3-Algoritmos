import java.util.ArrayList;
import java.util.Arrays;

class RadixSort {
    static int getMax(ArrayList<Integer> arr, int n) {
        int mx = arr.getFirst();
        for (int i = 1; i < n; i++)
            if (arr.get(i) > mx)
                mx = arr.get(i);
        return mx;
    }

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

    static void radixsort(ArrayList<Integer> arr, int n) {
        int m = getMax(arr, n);

        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }
}