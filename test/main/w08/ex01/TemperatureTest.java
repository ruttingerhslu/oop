package test.main.w08.ex01;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import src.main.w08.ex01.Temperature;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    private final float KELVIN_VALUE = 273.15f;
    Temperature temperature = new Temperature(0);

    @Test
    void testSetKelvin() {
        temperature.setKelvin(KELVIN_VALUE + 1);
        assertEquals(1, temperature.getCelsius());
    }

    @Test
    void testSetCelsius() {
        temperature.setCelsius(4f);
        assertEquals(4f, temperature.getCelsius());
    }

    @Test
    void testGetCelsius() {
        assertEquals(0f, temperature.getCelsius());
    }

    @Disabled
    void testEqualsVerifier() {
        // import equals verifier
    }

    @Test
    void testHashCode() {
        Temperature otherTemperature = new Temperature(0);

        assertEquals(temperature.hashCode(), otherTemperature.hashCode());
    }

    @Test
    void testToString() {
        assertEquals("Temperature\nTemperature in celsius: " + 0f, temperature.toString());
    }

    @Test
    void testCompareTo() {
        Temperature otherTemperature = new Temperature(2);

        assertTrue(temperature.compareTo(otherTemperature) < 0);
    }

    @Test
    void testConvertToKelvin() {
        assertEquals(KELVIN_VALUE, temperature.convertToKelvin(0));
    }

    @Test
    void testConvertToCelsius() {
        assertEquals(0f, temperature.convertToCelsius(KELVIN_VALUE));
    }
}