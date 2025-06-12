import java.util.Scanner;

import clases.table;
import java.util.List;
import utilidades.tableManager;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "tables.txt";

        while (true) {
            System.out.println("\nMENÚ:");
            System.out.println("1. Nueva mesa");
            System.out.println("2. Mostrar todas las mesas almacenadas");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    // Crear nueva mesa
                    System.out.print("Introduce el color de la mesa: ");
                    String color = scanner.nextLine();

                    System.out.print("Introduce el número de patas: ");
                    int legNumber;
                    try {
                        legNumber = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Número de patas no válido.");
                        break;
                    }

                    table t = new table(color, legNumber);
                    tableManager.saveTableToFile(t, filePath);
                    break;

                case "2":
                    // Mostrar todas las mesas almacenadas
                    List<table> tables = tableManager.getAllTablesFromFile(filePath);
                    if (tables.isEmpty()) {
                        System.out.println("No hay mesas almacenadas.");
                    } else {
                        System.out.println("Listado de mesas almacenadas:");
                        for (table mesa : tables) {
                            System.out.println(mesa);
                        }
                    }
                    break;

                case "0":
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

}
