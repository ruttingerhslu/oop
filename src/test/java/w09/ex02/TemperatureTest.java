package w09.ex02;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;
import w07.ex01.Person;

import static w09.ex02.Temperature.KELVIN_OFFSET;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    private final Temperature temperature = Temperature.createFromCelsius(0);

    @Test
    void testGetKelvin() {
        assertEquals(KELVIN_OFFSET, temperature.getKelvin());
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
        assertEquals(KELVIN_OFFSET, Temperature.convertToKelvin(0));
    }

    @Test
    void testConvertToCelsius() {
        assertEquals(0f, Temperature.convertToCelsius(KELVIN_OFFSET));
    }

    @Test
    void testCheckCelsius() {
        assertThatThrownBy(() -> Temperature.checkCelsius(-273.16f))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Celsius value can't be under -273.15!");
    }

    @Test
    void testCheckKelvin() {
        assertThatThrownBy(() -> Temperature.checkKelvin(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Kelvin value can't be under 0!");
    }
}