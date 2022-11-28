package w08.ex03;

import w08.ex03.StateOfMatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementTest {
    float currentTemperature = 12f;
    Element element = new Element("Wasserstoff", -252.9f, -259.2f, currentTemperature);

    @Test
    void testGetState() {
        assertEquals(StateOfMatter.GAS, element.getState());
    }

    @Test
    void testGetDescription() {
        assertEquals("Wasserstoff ist bei " + currentTemperature + "°C gasförmig.", element.getDescription());
    }

    @Test
    void testGetDescriptionOther() {
        float otherTemperature = -260;

        element.setTemperature(otherTemperature);

        assertEquals("Wasserstoff ist bei " + otherTemperature + "°C fest.", element.getDescription());
    }

}