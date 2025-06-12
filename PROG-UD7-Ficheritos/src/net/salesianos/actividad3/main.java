package net.salesianos.actividad3;

import java.io.File;

public class main {
    static File file = new File("FicheritoCreadoCodigo.txt");
    public static void main(String[] args) {
        
        System.out.println("Archivo creado: " + file.getName());
        try {
            file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
