package test.main.w08.ex01;

import org.junit.jupiter.api.Test;
import src.main.w08.ex01.Temperature;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    private final float KELVIN_VALUE = 273.15f;
    Temperature temperature = new Temperature(0);

    @Test
    void testSetKelvin() {
        temperature.setKelvin(KELVIN_VALUE + 1);
        assertEquals(KELVIN_VALUE + 1, temperature.getKelvin());
    }

    @Test
    void testSetCelsius() {
        temperature.setCelsius(4);
        assertEquals(KELVIN_VALUE + 4, temperature.getKelvin());
    }

    @Test
    void testsGetCelsius() {
        assertEquals(0, temperature.getCelsius());
    }
}