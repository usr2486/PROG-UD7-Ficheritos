import net.salesianos.actividad4.clases.table;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class tableManager {
    
    public static void saveTableToFile(table table, String filePath) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            
            writer.write(table.getColor() + ";" + table.getLegNumber() + System.lineSeparator());
            System.out.println("Mesa guardada en fichero correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar la mesa en el fichero:");
            ;
        }
    }

    
    public static List<table> getAllTablesFromFile(String filePath) {
        List<table> tables = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                
                String[] parts = line.split(";");
                if (parts.length == 2) {
                    String color = parts[0];
                    int numberOfLegs = Integer.parseInt(parts[1]);
                    tables.add(new table(color, numberOfLegs));
                }
            }
            System.out.println("Mesas leídas del fichero correctamente.");
        } catch (IOException e) {
            System.out.println("Error al leer las mesas del fichero:");
            e.printStackTrace();
        }
        return tables;
    }
}