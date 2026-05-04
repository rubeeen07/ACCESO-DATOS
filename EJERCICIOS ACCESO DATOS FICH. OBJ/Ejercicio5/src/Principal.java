import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Principal {

    /*A partir del fichero impresoras anterior crea dos ficheros: uno con las impresoras láser
y otro con las impresoras de tinta*/

    static void main() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("impresoras.dat"))) {

            ArrayList<Impresora> listaImpresora = (ArrayList<Impresora>) ois.readObject();

            for (int i = 0; i < listaImpresora.size(); i++) {

                Impresora imp = listaImpresora.get(i);

                if (imp.getTipo()==TipoImpresora.LASER) {

                    try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("laser.dat"))) {


                    } catch ()


                }



            }



        } catch (Exception e) {
            e.getMessage();
        }









    }

}
