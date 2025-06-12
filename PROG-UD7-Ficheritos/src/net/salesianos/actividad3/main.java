package net.salesianos.actividad3;

import net.salesianos.actividad3.utilidades.fileMerge;
import java.io.File;

public class main {

    static File file = new File("FicheritoCreadoCodigo.txt");

    static File file = new File("C:/Users/Usuario/Documents/GitHub/PROG-UD7-Ficheritos/PROG-UD7-Ficheritos/src/net/salesianos/actividad3/FicheritoCreadoCodigo.txt");


    public static void main(String[] args) {

        System.out.println("Archivo creado: " + file.getName());
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("Error al crear el archivo: ");
        }
        fileMerge.mergeFiles(
                "C:/Users/Usuario/Documents/GitHub/PROG-UD7-Ficheritos/PROG-UD7-Ficheritos/src/net/salesianos/actividad1/texto.txt",
                "C:/Users/Usuario/Documents/GitHub/PROG-UD7-Ficheritos/PROG-UD7-Ficheritos/src/net/salesianos/actividad2/ficherito.txt",
                "C:/Users/Usuario/Documents/GitHub/PROG-UD7-Ficheritos/PROG-UD7-Ficheritos/src/net/salesianos/actividad3/FicheroFusionado.txt");

    }
}
