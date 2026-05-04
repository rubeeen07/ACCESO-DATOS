import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Principal {
    /*A partir del fichero impresoras anterior crea un fichero ordenado por número de serie
     * */

    static void main() {

        ArrayList<Impresora> listaImpresora;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("impresoras.dat"))) {


            listaImpresora = (ArrayList<Impresora>) ois.readObject();

            System.out.println("Lista sin ordenar: " + listaImpresora);
            Collections.sort(listaImpresora);

            System.out.println("Lista ordenada: "+listaImpresora);

            try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("impresoraOrdenado.dat"))) {

                ous.writeObject(listaImpresora);

            } catch (Exception e) {
                e.printStackTrace();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
