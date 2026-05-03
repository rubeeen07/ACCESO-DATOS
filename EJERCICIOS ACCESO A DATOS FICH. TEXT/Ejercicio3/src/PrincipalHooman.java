import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PrincipalHooman {
    public static void main(String[] args) {
        /**
         * 3. Usando el fichero notas.txt como fuente de datos, desarrollar un programa que pida por teclado
         * un número y lo busque en el fichero. Si lo encuentra, mostrará el valor anterior (si lo hubiese)
         * y el  siguiente (si lo hubiese). En caso contrario, mostrar el mensaje “número no encontrado”.
         */

        try(Scanner lector= new Scanner(new FileReader("notas.txt"));
            Scanner escritor= new Scanner(System.in))  {

            System.out.println("Introduce un numero:");
            int numeroMetido = escritor.nextInt();

            List<Integer> listaNumeros= new ArrayList<>();

            while (lector.hasNext()) {
                listaNumeros.add(lector.nextInt());
            }

            int posicion = -1;

            for (int i = 0; i < listaNumeros.size(); i++) {
                if(listaNumeros.get(i) == numeroMetido) {
                    posicion = i;
                    break;
                }

            }

            if (posicion == -1) {
                System.out.println("Numero no encontrado");
                return;
            }

            if (posicion == 0) {
                System.out.println("No hay numero anterior");
            }

            if(posicion == listaNumeros.size()-1) {
                System.out.println("No hay numero siguiente");
            }

            if (posicion > 0) {
                System.out.println("El numero anterior es: "+ listaNumeros.get(posicion-1));
            }

            if (posicion < listaNumeros.size()-1) {
                System.out.println("El numero siguiete es: "+ listaNumeros.get(posicion+1));
            }

        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}