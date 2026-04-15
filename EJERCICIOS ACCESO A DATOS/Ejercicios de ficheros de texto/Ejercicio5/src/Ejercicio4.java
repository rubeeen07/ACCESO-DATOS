/*4.  A partir del fichero notas.txt, leer los números de tres en tres
(suponer que hay una cantidad de valores múltiplo de 3) y crear un nuevo fichero
que contendrá en cada línea la media de esos tres valores.  */
import java.io.*;

public class Ejercicio4 {
    public static void main(String[] args) {

        String numero1, numero2, numero3;

        double media = 0;

        try(BufferedReader br = new BufferedReader(new FileReader("notas.txt"));
            PrintWriter pr = new PrintWriter(new BufferedWriter(new FileWriter("ficheroMedia.txt")))) {

        while ((numero1 = br.readLine())!=null) {
            numero2 = br.readLine();
            numero3 = br.readLine();


            media = ((Double.parseDouble(numero1) + Double.parseDouble(numero2) + Double.parseDouble(numero3))/3);

            pr.println(media);
        }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
