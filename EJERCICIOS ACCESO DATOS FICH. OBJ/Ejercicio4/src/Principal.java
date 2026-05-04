import java.io.*;
import java.util.ArrayList;

public class Principal {
    /**A partir del fichero impresoras anterior contabiliza cuántas impresoras son de tinta y
     cuántas son láser. Muestra estos dos valores por pantalla.*/

    static void main() {

        int contador1=0;
        int contador2=0;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("impresoras.dat"))) {

            ArrayList<Impresora> lista = (ArrayList<Impresora>) ois.readObject();

            for (int i = 0; i < lista.size(); i++) {

                Impresora imp = lista.get(i);


                if (imp.getTipo().equals(TipoImpresora.LASER)){

                    contador1++;
                } else if (imp.getTipo().equals(TipoImpresora.TINTA)) {

                    contador2++;
                }


            }

            System.out.println("Laser: "+contador1+" - "+"Tinta: "+contador2);


        } catch (EOFException e) {
            System.out.println("Lectura finalizada");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
