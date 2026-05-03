import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {

        /* 7. A partir de un fichero en formato csv, crear otro fichero csv que tenga en cada línea el
        primer y el último valor de la línea correspondiente del fichero csv original. */

        try (
                BufferedReader br = new BufferedReader(new FileReader("original.csv"));
                PrintWriter pw = new PrintWriter(new FileWriter("resultado.csv"))
        ) {

            String linea;
            while ((linea = br.readLine()) != null) {
                // Separamos la línea por comas
                String[] palabra = linea.split(",");

                if (palabra.length>0) {

                    String primero= palabra[0];
                    String ultimo = palabra[palabra.length-1];

                    pw.println("Primer valor: "+primero+", Ultimo valor: "+ultimo);
                }

            }

            System.out.println("Proceso completado con éxito.");

        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}