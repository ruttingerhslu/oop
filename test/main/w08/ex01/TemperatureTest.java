package test.main.w08.ex01;

import org.junit.jupiter.api.Test;
import src.main.w08.ex01.Element;
import src.main.w08.ex01.Temperature;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    Temperature temperature = new Temperature(4);

    @Test
    void testSetTemperature() {
        temperature.setTemperature(5);
        assertEquals(5, temperature.getTemperature());
    }

    @Test
    void testGetKelvin() {
        assertEquals(277.15, temperature.getKelvin());
    }

    @Test
    void testGetFahrenheit() {
        assertEquals(39.2, temperature.getFahrenheit());
    }

    @Test
    void testChangeCelsius() {
        temperature.changeCelsius(-6);
        assertEquals(-2, temperature.getTemperature());
    }

    @Test
    void testStateOfMatterElement() {
        Element element = new Element(10, 2);
        assertEquals("flüssig", temperature.getStateOfMatter(element));
    }

    @Test
    void testStateOfMatterString() {
        assertEquals("fest", temperature.getStateOfMatter("Pb"));
    }
}