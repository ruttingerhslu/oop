package main.w09.ex02;

import main.w07.ex01.Person;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    private final float KELVIN_VALUE = 273.15f;
    Temperature temperature = Temperature.createFromCelsius(0);

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
    void testGetKelvin() {
        assertEquals(273.15f, temperature.getKelvin());
    }

    @Test
    void testGetCelsius() {
        assertEquals(0f, temperature.getCelsius());
    }

    @Test
    void testKelvinConstructor() {
        Temperature otherTemperature = Temperature.createFromKelvin(273.15f);
        assertEquals(temperature, otherTemperature);
    }

    @Test
    void testEqualsContract() {
        EqualsVerifier.forClass(Person.class).verify();
    }

    @Test
    void testHashCode() {
        Temperature otherTemperature = Temperature.createFromCelsius(0);

        assertEquals(temperature.hashCode(), otherTemperature.hashCode());
    }

    @Test
    void testToString() {
        assertEquals("Temperature\nTemperature in celsius: " + 0f, temperature.toString());
    }

    @Test
    void testCompareTo() {
        Temperature otherTemperature = Temperature.createFromCelsius(2);

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