import java.io.*;

public class Principal {
    static void main() {


        /** 4. A partir del fichero notas.txt, leer los números de tres en tres (suponer que hay una
        cantidad de valores múltiplo de 3) y crear un nuevo fichero que contendrá en cada línea
        la media de esos tres valores.
        * */

        String linea1, linea2, linea3;
        Double media=0.0;
        try (BufferedReader br = new BufferedReader(new FileReader("notas.txt"));
             PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Ej4.txt")))) {

            while ((linea1= br.readLine())!=null &&
                    (linea2= br.readLine())!=null &&
                    (linea3= br.readLine())!=null
            ) {


                media = (Double.parseDouble(linea1)+Double.parseDouble(linea2)+Double.parseDouble(linea3))/3;


                pw.println(media);

            }


        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

/*import java.io.*;

public class Principal {
    public static void main(String[] args) {
        String numero1;
        String numero2;
        String numero3;
        double media;

        try(BufferedReader br= new BufferedReader(new FileReader("notas.txt"));
            PrintWriter pw= new PrintWriter(new BufferedWriter(new FileWriter("media.txt")))) {

            while ((numero1= br.readLine())!=null &&
                    (numero2= br.readLine())!=null &&
                    (numero3= br.readLine())!=null
            ) {
                media = (Double.parseDouble(numero1) +
                        Double.parseDouble(numero2) +
                        Double.parseDouble(numero3) ) / 3;

                pw.println(media);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}*/
