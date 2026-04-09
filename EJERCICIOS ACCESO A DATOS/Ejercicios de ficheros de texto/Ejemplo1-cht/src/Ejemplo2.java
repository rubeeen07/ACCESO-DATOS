import java.io.*;

/*Escribe números en un archivo usando buffering para mejorar el rendimiento.*/
public class Ejemplo2 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("ejemplo2.txt")
            );

            for (int i = 0; i < 6; i++) {
                bw.write("Numéro: " +i);
                bw.newLine();
            }

            bw.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
