import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej3 {
    public static void main(String[] args) {

        String anterior = null, siguiente, actual;

        //Pedir por teclado
        String numeroBuscado = "3";

        try (BufferedReader ficheroNotas = new BufferedReader(new FileReader("notas.txt"));
        ) {

            while ((actual = ficheroNotas.readLine()) != null) {

                if (actual.equals(numeroBuscado)) {
                    System.out.printf("Número encontrado: %d".formatted(actual));
                    if (anterior != null) {
                        System.out.printf("Anterior: %d".formatted(anterior));
                    } else {
                        System.out.println("No hay anterior");
                    }


                    siguiente = ficheroNotas.readLine();
                    if (siguiente != null) {
                        System.out.printf("Siguiente: %d".formatted(siguiente));
                    } else {
                        System.out.println("No hay siguiente");
                    }
                    break;
                }

                anterior = actual;

            }


        } catch (FileNotFoundException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}
