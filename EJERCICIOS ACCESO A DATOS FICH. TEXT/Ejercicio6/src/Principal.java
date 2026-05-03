import java.io.*;

public class Principal {
    static void main() {
        /*6. A partir de un fichero html, crear un fichero imagenes .txt en el que se almacenen los
        nombres de los ficheros de las imágenes con formato png contenidas en el documento
        mediante la etiqueta img
        */


        String lineaHtml,nombreFicheroImagen;
        final String lineaImagen="<img src=\"";
        int posicion,posicionComienzoNombreFicheroImagen,longitudEtiquetaImagen,posicionComilla;


        longitudEtiquetaImagen=lineaImagen.length();

        try (BufferedReader ficheroHtml=new BufferedReader(new FileReader("index.html"));
             PrintWriter ficheroImagenes=new PrintWriter(new FileWriter("imagenes.txt")); ){
            while((lineaHtml=ficheroHtml.readLine())!=null) {
                posicion=lineaHtml.indexOf(lineaImagen);
                if (posicion!=-1) {
                    posicionComienzoNombreFicheroImagen=posicion+longitudEtiquetaImagen;
                    posicionComilla=lineaHtml.substring(posicionComienzoNombreFicheroImagen).indexOf("\"");
                    nombreFicheroImagen=lineaHtml.substring(posicionComienzoNombreFicheroImagen,posicionComienzoNombreFicheroImagen+posicionComilla);
                    if (nombreFicheroImagen.endsWith(".png")) {
                        ficheroImagenes.println(nombreFicheroImagen);
                    }
                }

            }





        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }
}
