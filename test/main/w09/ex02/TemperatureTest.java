package main.w09.ex02;

import main.w07.ex01.Person;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    private final float KELVIN_VALUE = 273.15f;
    private final Temperature temperature = Temperature.createFromCelsius(0);

    @Test
    void testGetKelvin() {
        assertEquals(273.15f, temperature.getKelvin());
    }

    @Test
    void testGetCelsius() {
        assertEquals(0f, temperature.getCelsius());
    }

    @Test
    void testCreateFromCelsius() {
        Temperature otherTemperature = Temperature.createFromCelsius(0);
        assertEquals(temperature, otherTemperature);
    }

    @Test
    void testCreateFromKelvin() {
        Temperature otherTemperature = Temperature.createFromKelvin(273.15f);
        assertEquals(temperature, otherTemperature);
    }

    @Test
    void testIllegalCelsiusException() {
        assertThatThrownBy(() -> Temperature.createFromCelsius(-273.16f))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Celsiuswert darf nicht unter -273.15 sein!");
    }

    @Test
    void testIllegalKelvinException() {
        assertThatThrownBy(() -> Temperature.createFromKelvin(-1))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Kelvinwert darf nicht unter 0 sein!");
    }

    @Test
    void testIllegalScaleException() {
        assertThatThrownBy(Temperature::createFromFahrenheit)
            .isInstanceOf(NotImplementedException.class)
            .hasMessage("Not implemented yet!");
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