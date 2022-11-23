package main.w09.ex03;

import main.w08.ex01.Temperature;
import main.w08.ex02.TemperatureTrend;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        final ArrayList<Temperature> temperatures = new ArrayList<>();
        TemperatureTrend temperatureTrend = new TemperatureTrend(temperatures);
        do {
            logger.info("Bitte Temperatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();
            try {
                float temperature = Float.parseFloat(input);
                if (temperature < -273.15f) throw new IllegalArgumentException("Temperature under 273.15°C!");
                temperatures.add(new Temperature(temperature));
            } catch (NumberFormatException ex) {
                if (input.equals("exit")) break;
                logger.error("Eingabe muss eine Zahl sein!");
            } catch (IllegalArgumentException ex) {
                logger.error("Temperatur darf nicht unter -273.15°C sein!");
            }
        } while (!input.equals("exit"));
        logger.info("Programm beendet." + temperatureTrend);
    }
}
