import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class JUnit {

    @Test
    public void testRandSingle() {
        int result = Randnum.randSingle();
        assertTrue("Número generado no está en el rango esperado", result >= 1 && result <= 10);
    }

    @Test
    public void testRand() {
        ArrayList<Integer> result = Randnum.rand();
        assertNotNull("La lista de números aleatorios es nula", result);
        assertEquals("La lista de números aleatorios no tiene el tamaño esperado", 10, result.size());
        for (int num : result) {
            assertTrue("Número generado no está en el rango esperado", num >= 1 && num <= 10);
        }
    }

    @Test
    public void testRadixSort() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(170);
        arr.add(45);
        arr.add(75);
        arr.add(90);
        arr.add(802);
        arr.add(24);
        arr.add(2);
        arr.add(66);

        RadixSort.radixsort(arr, arr.size());

        for (int i = 0; i < arr.size() - 1; i++) {
            assertTrue("La ordenación no es correcta", arr.get(i) <= arr.get(i + 1));
        }
    }

    @Test
    public void testQuickSort() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(170);
        arr.add(45);
        arr.add(75);
        arr.add(90);
        arr.add(802);
        arr.add(24);
        arr.add(2);
        arr.add(66);

        QuickSort quickSort = new QuickSort();
        quickSort.quicksort(arr, 0, arr.size() - 1);

        for (int i = 0; i < arr.size() - 1; i++) {
            assertTrue("La ordenación no es correcta", arr.get(i) <= arr.get(i + 1));
        }
    }

    @Test
    public void testGnomeSort() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(170);
        arr.add(45);
        arr.add(75);
        arr.add(90);
        arr.add(802);
        arr.add(24);
        arr.add(2);
        arr.add(66);

        GnomeSort.gnomeSort(arr);

        for (int i = 0; i < arr.size() - 1; i++) {
            assertTrue("La ordenación no es correcta", arr.get(i) <= arr.get(i + 1));
        }
    }

    @Test
    public void testCocktailSort() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(170);
        arr.add(45);
        arr.add(75);
        arr.add(90);
        arr.add(802);
        arr.add(24);
        arr.add(2);
        arr.add(66);

        CocktailSort cocktailSort = new CocktailSort();
        cocktailSort.cocktailSort(arr);

        for (int i = 0; i < arr.size() - 1; i++) {
            assertTrue("La ordenación no es correcta", arr.get(i) <= arr.get(i + 1));
        }
    }
}