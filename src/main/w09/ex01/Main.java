package main.w09.ex01;

import main.w08.ex01.Temperature;
import main.w08.ex02.TemperatureTrend;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        final ArrayList<Temperature> temperatures = new ArrayList<>();
        TemperatureTrend temperatureTrend = new TemperatureTrend(temperatures);
        do {
            System.out.println("Bitte Temperatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();
            try {
                temperatureTrend.add(new Temperature(Float.parseFloat(input)));
            } catch (NumberFormatException ex) {
                if (input.equals("exit")) break;
            }
        } while (!input.equals("exit"));
        System.out.println("Programm beendet." + temperatureTrend);
    }
}
