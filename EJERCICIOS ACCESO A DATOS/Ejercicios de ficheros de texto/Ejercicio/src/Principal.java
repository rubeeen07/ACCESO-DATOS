import java.io.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final int CANTIDAD_ALUMNOS=10;
        String numeroExpediente, nombre, apellidos;
        Alumno[] alumnos=new Alumno[CANTIDAD_ALUMNOS];


        for (int i = 0; i < CANTIDAD_ALUMNOS; i++) {

            System.out.printf("exp");
            numeroExpediente=teclado.nextLine();
            System.out.printf("exp");
            nombre=teclado.nextLine();
            System.out.printf("exp");
            apellidos=teclado.nextLine();
            alumnos[i] = new Alumno(numeroExpediente,nombre,apellidos);

        }


        //ordeno el array



        //guardo array ordenado
        try (ObjectOutputStream fiecheroAlumnos= new ObjectOutputStream(new BufferedOutputStream
                (new FileOutputStream("alumnos.dat")))) {


//            fiecheroAlumnos.writeObject(alumnos);
            //otra opcion
            for (int i = 0; i < alumnos.length; i++) {
                fiecheroAlumnos.writeObject(alumnos[i]);
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }




    }
}
