package net.salesianos.actividad1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribeme aqui algo pero sin pasarte colega");

        String text = scanner.nextLine();

        while (text.length() < 30) {

            System.out.println("Eso es muy corto colega explayate mas");
            text = scanner.nextLine();
        }
        scanner.close();
    }
}