/*Guarda en un archivo binario los siguientes datos de un producto:

precio (double)
cantidad (int)
nombre (String)*/

import java.io.*;

public class EscribirData {
    public static void main(String[] args) {
        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("producto.dat")));

        out.writeDouble(12.99);
        out.writeInt(2);
        out.writeUTF("móvil");


        out.close();

        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("producto.dat")));
        double precio=in.readDouble();
        int cantidad=in.readInt();
        String nombre= in.readUTF();

        in.close();

        System.out.printf("PRECIO: %f €, CANTIDAD: %d, NOMBRE: %s".formatted(precio, cantidad, nombre));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
