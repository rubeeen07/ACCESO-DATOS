/*4.  A partir del fichero notas.txt, leer los números de tres en tres
(suponer que hay una cantidad de valores múltiplo de 3) y crear un nuevo
fichero que contendrá en cada línea la media de esos tres valores.  */

import java.io.*;


public class Ejercicio4 {
    public static void main(String[] args) {

        String numero1, numero2, numero3;

        try (BufferedReader br = new BufferedReader(new FileReader("notas.txt"))) {






        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
