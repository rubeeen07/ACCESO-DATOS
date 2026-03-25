import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ej2 {
    public static void main(String[] args) throws IOException {

        try(FileReader ficheroAnterior = new FileReader("notas.txt");
            PrintWriter ficherosMayorMedia = new PrintWriter(new FileWriter("mayorMedia.txt"));) {


        }
    }
}
