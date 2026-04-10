/*Crea una clase Alumno y guarda un objeto en un archivo.*/
// MIRAR Alumnop1

import java.io.*;

public class Alumnop2 {
    public static void main(String[] args) {

        try {
            // 1. ESCRITURA
            // Creamos el flujo, escribimos y CERRAMOS inmediatamente con .close()
            ObjectOutputStream obj = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("alumno.dat")));

            Alumnop1 a1 = new Alumnop1("PACO", 67);
            obj.writeObject(a1);
            obj.close(); // Muy importante cerrar antes de leer

            System.out.println("Objeto guardado. Iniciando lectura...");

            // 2. LECTURA
            ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("alumno.dat")));

            // Usamos un bucle para leer hasta que salte la excepción de fin de archivo
            while (true) {
                // RECUERDA: readObject() no lleva parámetros y devuelve el objeto
                Alumnop1 leido = (Alumnop1) in.readObject();
                System.out.println("Nombre: " + leido.getNombre() + ", Edad: " + leido.getEdad());
            }

        } catch (EOFException e) {
            // Cuando el archivo se acaba, el programa llega aquí de forma natural
            System.out.println("Lectura completada con éxito.");
        } catch (IOException | ClassNotFoundException e) {
            // Aquí caerá si el archivo no existe o si hay un error de permisos
            e.printStackTrace();
        }
    }
}
