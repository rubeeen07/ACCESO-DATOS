import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    static void main() {


        /*
        * 2. Realizar otro programa que leyendo el fichero anterior cree un nuevo archivo en el
        *    que se almacenen los números cuyo valor sea mayor que la media. Además, se deberá
        *    mostrar por pantalla la suma total de los números y la media.
        * */

        List<Integer> listaNumeros = new ArrayList<>();;

        String linea;
        int media=0;
        int numeroTotal=0;


        try(BufferedReader bw = new BufferedReader(new FileReader("notas.txt"))) {


            while((linea=bw.readLine())!=null) {

                int numero = Integer.parseInt(linea);

                listaNumeros.add(numero);
                numeroTotal += numero;

                media = numeroTotal/listaNumeros.size();
            }

            System.out.println(listaNumeros);
            System.out.println("MEDIA: "+media);
            System.out.println("NOTA TOTALES: "+numeroTotal);



        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("ej2.txt")))) {

            for (int i = 0; i < listaNumeros.size(); i++) {
                int numero= listaNumeros.get(i);
                if (numero>media){

                    pw.println(numero);
                }
            }

        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
