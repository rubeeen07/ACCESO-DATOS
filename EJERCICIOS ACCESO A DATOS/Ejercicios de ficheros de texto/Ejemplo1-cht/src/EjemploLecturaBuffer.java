import java.io.*;
public class EjemploLecturaBuffer {
    public static void main(String[] args) {
        try {
            // 1. PRIMERO ESCRIBIMOS (Esto crea el archivo si no existe)
            BufferedWriter bw = new BufferedWriter(new FileWriter("numeros.txt"));
            bw.write("Línea de prueba 1");
            bw.newLine();
            bw.close();

            // 2. AHORA SÍ PODEMOS LEERLO
            BufferedReader br = new BufferedReader(new FileReader("numeros.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println("Leído: " + linea);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}