/*5. Crear un fichero de texto que guarde una palabra en cada línea. Mostrar por pantalla la palabra
con más caracteres (en caso de empate se puede mostrar la que el alumno desee).
También crear un fichero con las palabras que son palíndromos (una por línea). */

import java.io.*;
import java.util.ArrayList;


public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        // Primero: escribir
        try (PrintWriter pr = new PrintWriter(new BufferedWriter(new FileWriter("ej5.txt")))) {
            pr.println("COQUITA");
            pr.println("SOL");
            pr.println("EL JEFASO DEL DOWN");
            pr.println("NEGRITO");
            pr.println("OJO");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Segundo: leer (el archivo ya está cerrado y guardado)
        try (BufferedReader br = new BufferedReader(new FileReader("ej5.txt"))) {
            String linea;
            String palabraMasLarga = "";

            while ((linea = br.readLine()) != null) {
                lista.add(linea);
                if (linea.length() > palabraMasLarga.length()) {
                    palabraMasLarga = linea;
                }
            }

            System.out.println("Palabra más larga: " + palabraMasLarga);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}