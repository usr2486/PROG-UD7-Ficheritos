package net.salesianos.actividad1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("texto.txt", true);
        } catch (java.io.IOException e) {
            e.printStackTrace();
            scanner.close();
            return;
        }

        System.out.println("Escribeme aqui algo pero sin pasarte colega");

        String text = scanner.nextLine();

        while (text.length() < 30) {

            System.out.println("Eso es muy corto colega explayate mas");
            text = scanner.nextLine();

        }
        String formattedText = text.toUpperCase().replaceAll(" ", "_");
        System.out.println("Tu texto es: " + formattedText);

        try {
            fileWriter.write(formattedText);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        scanner.close();

        if (fileWriter != null) {
            try {
                fileWriter.close();
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
    }
}