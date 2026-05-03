import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal {


    /*
    * 3. Usando el fichero notas.txt como fuente de datos, desarrollar un programa que pida
    por teclado un número y lo busque en el fichero. Si lo encuentra, mostrará el valor
    anterior (si lo hubiese) y el siguiente (si lo hubiese). En caso contrario, mostrar el
    mensaje “número no encontrado”.
    *
    * */
    static void main() {

        String  siguiente, anterior=null;

        try (Scanner sc = new Scanner(System.in); BufferedReader br = new BufferedReader(new FileReader("notas.txt"))) {

            System.out.println("Introduce un número: \n");
            int  numero = sc.nextInt();

            String linea;
            while ((linea=br.readLine())!=null) {



                if (Integer.parseInt(linea) == numero) {

                    System.out.println("Valor actual: "+linea);

                    if (anterior != null) {
                        System.out.printf("Anterior: "+anterior+"\n");
                    } else {
                        System.out.println("No hay anterior\n");
                    }

                    siguiente = br.readLine();
                    if (siguiente != null) {
                        System.out.printf("Siguiente: "+siguiente);
                    } else {
                        System.out.println("No hay siguiente\n");
                    }
                }

                anterior = linea;

            }





        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
