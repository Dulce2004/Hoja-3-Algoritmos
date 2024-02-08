import java.util.ArrayList;

class MergeSort {
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

    void mergesort(ArrayList<Integer> arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            mergesort(arr, l, m);
            mergesort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }
}