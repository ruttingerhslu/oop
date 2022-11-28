package main.w09.ex03;

import main.w09.ex02.Temperature;
import main.w08.ex02.TemperatureTrend;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class TemperatureLogger {
    private static final Logger logger = LogManager.getLogger(TemperatureLogger.class);

    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        final TemperatureTrend temperatureTrend = new TemperatureTrend();
        do {
            logger.info("Please enter temperature ('exit' to exit program): ");
            input = scanner.next();
            try {
                if ("exit".equals(input)) break;
                Temperature temperature = Temperature.createFromCelsius(Float.parseFloat(input));
                temperatureTrend.add(temperature);
            } catch (NumberFormatException ex) {
                logger.error("Input has to be a number!");
            } catch (IllegalArgumentException ex) {
                logger.error("Temperature can't be under -273.15°C!");
            }
        } while (true);
        logger.info("Program finished. \n" + temperatureTrend);
    }
}
