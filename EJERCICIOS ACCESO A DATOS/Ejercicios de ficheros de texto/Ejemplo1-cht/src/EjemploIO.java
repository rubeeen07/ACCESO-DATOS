/*Crea un programa que escriba el texto "Hola DAM" en un archivo llamado saludo.txt y luego lo lea y lo muestre por pantalla.*/

import java.io.*;
import java.util.Objects;

public class EjemploIO {
    public static void main(String[] args) {
        try {
            //ESCRIBIR
            FileWriter fw = new FileWriter("saludo.txt");
            fw.write("Hola DAM me llamo Eduardo");
            fw.close();

            //LEER
            FileReader fr = new FileReader("saludo.txt");
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
