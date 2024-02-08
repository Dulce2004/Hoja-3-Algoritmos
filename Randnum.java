import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

/**
 * Clase Randnum métodos para generar números aleatorios y guardarlos en un archivo CSV.
 */
public class Randnum {
    /**
     * Genera un número entero aleatorio en el rango [1, 10].
     * @return Número aleatorio generado.
     */
    public static int randSingle() {
        Random rand = new Random();
        return rand.nextInt(10) + 1;
    }
    /**
     * Genera una lista de 10 números enteros aleatorios en el rango [1, 10] y los guarda en un archivo CSV.
     * @return Lista de números aleatorios generados.
     */
    public static ArrayList<Integer> rand() {
        Random rand = new Random();

        ArrayList<Integer> numerosAleatorios = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numerosAleatorios.add(rand.nextInt(10) + 1);
            System.out.println("Número aleatorio " + (i + 1) + ": " + numerosAleatorios.get(i));
        }

        try {
            PrintWriter writer = new PrintWriter("numerosprueba.csv", "UTF-8");
            for (int i = 0; i < 10; i++) {
                writer.println(numerosAleatorios.get(i));
            }
            writer.close();
            System.out.println("Los números aleatorios se han guardado en el archivo 'numerosprueba.csv'.");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al escribir en el archivo.");
            e.printStackTrace();
        }

        return numerosAleatorios;
    }
}
