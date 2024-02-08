import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * Clase Main contiene el método main para ejecutar el programa principal.
 */
public class Main {
    public static void main(String[] args) {
        // Crear una lista de tamaño 10
        ArrayList<Integer> lista = new ArrayList<>(10);
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        CocktailSort ob = new CocktailSort();
        int n = lista.size()+10;
        System.out.println("Tamaño de n: "+n);

        // Llenar la lista con 10 valores aleatorios
        for (int i = 0; i < 10; i++) {
            lista.add(rand.nextInt(100)); // Genera un número aleatorio entre 0 y 99
        }

        // Solicitar entrada del usuario para continuar al segundo ciclo
        System.out.println("Presiona Enter para continuar...");
        scanner.nextLine();

        // Aumentar el tamaño de la lista en 1 en cada ciclo hasta tener 20 números
        for (int i = 10; i < 3000; i++) {
            lista.add(rand.nextInt(100)); // Genera un número aleatorio entre 0 y 99
            ob.cocktailSort(lista);
        }

        // Cerrar el scanner al final del programa
        scanner.close();
    }
}
