import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de tamaño 10
        ArrayList<Integer> lista = new ArrayList<>(10);
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

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
            GnomeSort.gnomeSort(lista);
        }

        // Cerrar el scanner al final del programa
        scanner.close();
    }
}
