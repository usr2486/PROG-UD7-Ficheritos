package net.salesianos.actividad3.utilidades;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileMerge {
    public static void mergeFiles(String fileOnePath, String fileTwoPath, String outputFilePath) {
        try {
            // Leer el contenido del primer archivo
            StringBuilder contentOne = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileOnePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    contentOne.append(line).append(System.lineSeparator());
                }
            }

            // Leer el contenido del segundo archivo
            StringBuilder contentTwo = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileTwoPath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    contentTwo.append(line).append(System.lineSeparator());
                }
            }

            // Formatear el contenido final
            String mergedText =
                "- Contenido del Fichero Uno: " + contentOne.toString().trim() + System.lineSeparator() +
                "- Contenido del Fichero Dos: " + contentTwo.toString().trim();

            // Escribir el contenido fusionado en el archivo de salida
            try (FileWriter writer = new FileWriter(outputFilePath)) {
                writer.write(mergedText);
            }

            System.out.println("¡Fusión completada correctamente!");
        } catch (IOException e) {
            System.out.println("Error al fusionar los ficheros:");
            e.printStackTrace();
        }
    }
}
