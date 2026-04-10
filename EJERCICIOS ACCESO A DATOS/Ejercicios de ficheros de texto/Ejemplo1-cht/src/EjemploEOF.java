/*Guarda varios productos y léelos todos hasta el final del archivo.*/

import java.io.*;

public class EjemploEOF {
    public static void main(String[] args) {
        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("productos.dat")));

            out.writeUTF("MOVIL");
            out.writeInt(1000);
            out.writeInt(1);

            out.writeUTF("LIBRO");
            out.writeInt(10);
            out.writeInt(3);

            out.close();

            DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("productos.dat")));

            while (true) {
                String nombre = in.readUTF();
                int precio = in.readInt();
                int cantidadd = in.readInt();


                System.out.printf("Nombre producto: %s, precio: %d, cantidad: %d\n".formatted(nombre, precio, cantidadd));
            }



        }catch (EOFException e) {
            System.out.println("FIN DEL ARCHIVO");
        }catch (IOException e) {
            e.printStackTrace();
        }


    }


}
