import java.io.*;

public class Principal {
    // Nota: He añadido 'public' y 'String[] args' para que el main funcione
    public static void main(String[] args) {

        /*
        * 5. Crear un fichero de texto que guarde una palabra en cada línea. Mostrar por pantalla
        la palabra con más caracteres (en caso de empate se puede mostrar la que el alumno
        desee). También crear un fichero con las palabras que son palíndromos (una por línea).
        * */

        // 1. Creamos el fichero inicial
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("ej5.txt")))) {
            pw.println("COQUITA");
            pw.println("RECONOCER");
            pw.println("HOOMANSITO");
            pw.println("ANA");
            pw.println("OJO");
        } catch (IOException e) {
            e.printStackTrace();
        }

        String palabraLarga = "";
        String linea;

        // 2. Leemos y procesamos
        try (BufferedReader br = new BufferedReader(new FileReader("ej5.txt"));
             PrintWriter pwPal = new PrintWriter(new FileWriter("palindromo.txt"))) {

            while ((linea = br.readLine()) != null) {
                // Lógica palabra más larga
                if (linea.length() > palabraLarga.length()) {
                    palabraLarga = linea;
                }

                // Lógica de palíndromo
                if (esPalindromo(linea)) {
                    pwPal.println(linea); // Lo guardamos en el nuevo fichero
                }
            }

            System.out.println("La palabra con más caracteres es: " + palabraLarga);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método para comprobar si una palabra es palíndromo
     */
    public static boolean esPalindromo(String texto) {
        // Quitamos espacios y pasamos a mayúsculas para que no falle con "Ana" o "Ojo"
        String procesada = texto.trim().toUpperCase();

        // Usamos StringBuilder para darle la vuelta fácilmente
        String invertida = new StringBuilder(procesada).reverse().toString();

        return procesada.equals(invertida);
    }
}
