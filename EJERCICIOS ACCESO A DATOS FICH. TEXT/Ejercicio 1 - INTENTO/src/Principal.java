import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        /*
        * 1. Realizar un programa que cree un fichero llamado notas.txt con un número entero en
            cada línea. Los datos se leerán por teclado.
        * */
        int nota;

        try (Scanner sc = new Scanner(System.in); PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("notas.txt")))) {

            for (int i = 0; i < 5; i++) {
                System.out.println("Introduce un número\n");

                nota = sc.nextInt();
                pw.println(nota);

            }


        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
