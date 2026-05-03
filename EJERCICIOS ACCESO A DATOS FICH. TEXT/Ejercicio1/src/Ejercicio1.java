/*1. Realizar un programa que cree un fichero llamado notas.txt con un número entero en cada línea. Los datos se leerán por teclado.  */
import java.io.*;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        // ESCRITURA: Usamos PrintWriter + BufferedWriter
        // El BufferedWriter hace que sea rápido, el PrintWriter que sea fácil
        try (Scanner teclado = new Scanner(System.in);
             PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("notas.txt")))) {

            for (int i = 1; i < 7; i++) {
                System.out.print("Introduce la nota " + (i) + ": ");
                int nota = teclado.nextInt(); // Leemos el número directamente

                out.println(nota); // Escribe el número y salta de línea automáticamente
            }
            System.out.println("Archivo guardado con éxito.");

        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }

        // LECTURA
        try (BufferedReader br = new BufferedReader(new FileReader("notas.txt"))) {
            String linea;
//            System.out.println("\n--- Notas recuperadas ---");
            while ((linea = br.readLine()) != null) {
                System.out.println("Nota: " + linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }

}