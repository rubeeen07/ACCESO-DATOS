/*3. Usando el fichero notas.txt como fuente de datos, desarrollar un programa que pida por
teclado un número y lo busque en el fichero. Si lo encuentra,
mostrará el valor anterior (si lo hubiese) y el siguiente (si lo hubiese). En caso contrario,
mostrar el mensaje “número no encontrado”. */


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        try (Scanner notaBuscada = new Scanner(System.in); BufferedReader br = new BufferedReader(new FileReader("notas.txt"))) {

            System.out.println("¿Qué nota quieres buscar?: ");

            int nota = notaBuscada.nextInt();


            String actual;
            String anterior=null, siguiente;

            while ((actual = br.readLine())!=null) {

                if (nota==Integer.parseInt(actual)) {
                    System.out.println("Valor encontrado: "+actual);

                    if (anterior!=null) {
                        System.out.println("Valor anterior: "+anterior);
                    } else {
                        System.out.println("No hay valor anterior");
                    }
                    siguiente= br.readLine();
                    if (siguiente!=null) {
                        System.out.println("Valor siguiente: "+siguiente);
                    } else {
                        System.out.println("No hay valor siguiente");
                    }
                }

                anterior = actual;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
