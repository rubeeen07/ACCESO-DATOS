/*2. Realizar otro programa que leyendo el fichero anterior cree un nuevo archivo en el que se
almacenen los números cuyo valor sea mayor que la media. Además, se deberá mostrar por pantalla
la suma total de los números y la media. */

import java.io.*;
import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader("notas.txt"))) {

//        ArrayList<Integer> lista = new ArrayList<>();

        String notas;
        while ((notas = br.readLine())!=null) {
            System.out.println("Notas guardadas: "+notas);


            lista.add(Integer.parseInt(notas));
        }

        int aux=0;
        for (int i = 0; i < lista.size(); i++) {
            aux+=lista.get(i);
        }
        System.out.println("Suma de notas: "+aux);

        System.out.println("Media: "+aux/lista.size());

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

    try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("archivo.txt")))) {


        for (int i = 0; i < lista.size(); i++) {
            int numero = lista.get(i);
            if (numero>3) {
                pw.println(numero);
            }

        }

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }


    }


}
