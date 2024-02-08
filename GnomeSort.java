import java.util.ArrayList;
public class GnomeSort {
    public static void gnomeSort(ArrayList<Integer> arr) {
        int index = 0;

        while (index < arr.size()) {
            if (index == 0 || arr.get(index) >= arr.get(index - 1)) {
                index++;
            } else {
                // Intercambiar elementos y retroceder
                int temp = arr.get(index);
                arr.set(index, arr.get(index - 1));
                arr.set(index - 1, temp);
                index--;
            }
        }
    }
}

