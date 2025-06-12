package net.salesianos.actividad1;

// Ejercicio 1: Crea un programa que solicite al usuario que introduzca un texto.;
import java.io.FileWriter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("texto.txt");
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