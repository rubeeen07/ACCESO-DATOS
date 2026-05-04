import java.io.*;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        /*A partir del fichero impresoras anterior crea dos ficheros: uno con las impresoras láser
y otro con las impresoras de tinta
        * */

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("impresoras.dat"))) {

            ArrayList<Impresora> listaImpresora = (ArrayList<Impresora>) ois.readObject();

            ArrayList<Impresora> laser = new ArrayList<>();
            ArrayList<Impresora> tinta = new ArrayList<>();

            for (int i = 0; i < listaImpresora.size(); i++) {
                Impresora imp = listaImpresora.get(i);

                if (imp.getTipo() == TipoImpresora.LASER) {
                    laser.add(imp);
                } else if (imp.getTipo() == TipoImpresora.TINTA) {
                    tinta.add(imp);
                }
            }

            try (ObjectOutputStream oosLaser = new ObjectOutputStream(new FileOutputStream("laser.dat"));
                 ObjectOutputStream oosTinta = new ObjectOutputStream(new FileOutputStream("tinta.dat"))) {

                oosLaser.writeObject(laser);
                oosTinta.writeObject(tinta);

            } catch (Exception e) {
                e.getMessage();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
