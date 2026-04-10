import java.io.*;

public class EjemploEOFp2 {
    public static void main(String[] args) {
        File file = new File("productos.dat");

        // 1. Escritura (Uso de try-with-resources para cerrar el stream automáticamente)
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            out.writeUTF("MOVIL");
            out.writeInt(1000);
            out.writeInt(1);

            out.writeUTF("LIBRO");
            out.writeInt(10);
            out.writeInt(3);
        } catch (IOException e) {
            System.err.println("Error al escribir: " + e.getMessage());
        }

        // 2. Lectura
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while (true) {
                String nombre = in.readUTF();
                int precio = in.readInt();
                int cantidad = in.readInt();

                // Añadido \n para que cada producto salga en su línea
                System.out.printf("Nombre producto: %s, precio: %d, cantidad: %d%n", nombre, precio, cantidad);
            }
        } catch (EOFException e) {
            // Este es el final del archivo, es normal.
            System.out.println(">>> Lectura completada con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
