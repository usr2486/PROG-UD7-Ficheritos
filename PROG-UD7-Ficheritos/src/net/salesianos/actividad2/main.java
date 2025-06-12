package net.salesianos.actividad2;

import java.io.FileReader;

public class main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("ficherito.txt");
            int code;
            while ((code = fileReader.read()) != -1) {
                char character = (char) code;
                System.out.print(character + "_" + code + ", ");
            }
            fileReader.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
