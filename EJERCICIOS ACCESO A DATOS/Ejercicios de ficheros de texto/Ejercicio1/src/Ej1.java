import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) throws IOException {

        String nota;
        //(PrintWriter ya tiene buffer)
        try(Scanner teclado= new Scanner(System.in);
                PrintWriter ficherosNotas = new PrintWriter(new FileWriter("notas.txt"));) {

            for (int i = 0; i < 10; i++) {
                System.out.println("Valor de la nota: ");
                 nota=teclado.nextLine();
                 //Opcional: validar que han escrito un número real
                 ficherosNotas.println(nota);
            }
        } catch (IOException e) {
            System.err.println("Error al crear/escribir fichero");
            e.printStackTrace();
        }

    }
}
