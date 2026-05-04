import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalImpresora {
    public static void main(String[] args) {
        ArrayList<Impresora> listaImpresora = new ArrayList<>();

        // Abrimos el Scanner dentro del try para que se cierre solo al final
        try (Scanner sc = new Scanner(System.in)) {

            //
            String coninuar;

            do {
                System.out.println("\n--- Datos de la impresora " );

                System.out.print("nº de serie (solo dígitos): ");
                int numero = sc.nextInt();
                sc.nextLine(); // LIMPIEZA DE BUFFER (Imprescindible tras nextInt)

                System.out.print("Marca: ");
                String marca = sc.nextLine();

                System.out.print("Modelo: ");
                String modelo = sc.nextLine();

                System.out.print("Tipo (LASER, TINTA): ");
                // Convertimos a mayúsculas para que coincida con el Enum
                TipoImpresora tipo = TipoImpresora.valueOf(sc.nextLine().toUpperCase());

                // Añadimos a la lista
                listaImpresora.add(new Impresora(numero, marca, modelo, tipo));

                System.out.println("quieres añadir otra impresora?");
                coninuar = sc.nextLine();
            } while (coninuar.equalsIgnoreCase("si"));

            // Preguntar si se quiere guardar
            System.out.print("\n¿Quieres almacenar estos objetos en un fichero? (si/no): ");
            String respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("si")) {
                // Creamos el fichero solo si el usuario dice "si"
                try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("impresoras.dat"))) {
                    ous.writeObject(listaImpresora);
                    System.out.println(">> Fichero 'impresoras.dat' creado y guardado con éxito.");
                } catch (IOException e) {
                    System.out.println("Error al escribir el fichero: " + e.getMessage());
                }
            } else {
                System.out.println("Operación finalizada sin guardar en fichero.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: El tipo de impresora debe ser LASER o TINTA.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }
}