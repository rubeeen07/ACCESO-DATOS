import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;

public class Principal {
    public static void main(String[] args) {
        Path rutaArchivo = Paths.get("animales.txt").toAbsolutePath();

        System.out.println("El archivo se creará en: " + rutaArchivo);

        try (Formatter f1 = new Formatter(rutaArchivo.toString());
             Animal a1 = new Animal("COQUITA")) {

            f1.format("Animal=%s", a1.getApodo());

        } catch (FileNotFoundException e) {
            System.err.println("Error de archivo: " + e.getMessage());
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}