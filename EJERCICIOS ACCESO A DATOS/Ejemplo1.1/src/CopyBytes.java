import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        try (FileInputStream in = new FileInputStream("xanadu.txt");
             FileOutputStream out = new FileOutputStream("outagain.txt");) {

            int c, contadorA=0;

            while ((c = in.read()) != -1) {
                out.write(c);
                System.out.print((char) c);

                if ((char)c=='a') {
                    contadorA++;
                }
            }
            System.out.println();
            System.out.println("-".repeat(20));
            System.out.printf("Hay %d 'a' minúsculas".formatted(contadorA));

        } catch (FileNotFoundException e) {
            System.err.println("Error al abrir xanadu.txt");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Error al escribir/leer");
            e.printStackTrace();
        }
    }
}
