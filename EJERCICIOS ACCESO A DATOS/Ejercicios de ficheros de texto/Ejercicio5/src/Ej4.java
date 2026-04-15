import java.io.*;

public class Ej4 {
    public static void main(String[] args) {

        String numero1, numero2, numero3;
        double media;

        //notas.txt hay que traerlo a este proyecto o poneindo la ruta absoluta
        try (BufferedReader ficherosNotas =new BufferedReader(new FileReader("notas.txt"));
             PrintWriter ficheroMedias = new PrintWriter(new FileWriter("medias.txt"));) {
            while ((numero1=ficherosNotas.readLine())!=null) {
                numero2=ficherosNotas.readLine();
                numero3=ficherosNotas.readLine();

                media=(Double.parseDouble(numero1)+
                        Double.parseDouble(numero2)+
                        Double.parseDouble(numero3))/3;

                ficheroMedias.println(media);
            }


        } catch (FileNotFoundException e) {
            //TODO AAuto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            //TODO AAuto-generated catch block
            e.printStackTrace();
        }


    }
}
