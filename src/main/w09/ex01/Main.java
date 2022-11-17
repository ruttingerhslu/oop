package src.main.w09.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bitte Temperatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();
            float value = Float.valueOf(input);
        } while (!input.equals("exit"));
        System.out.println("Programm beendet.");
    }
}
