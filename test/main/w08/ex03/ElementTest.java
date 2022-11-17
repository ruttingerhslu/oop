package test.main.w08.ex03;

import org.junit.jupiter.api.Test;
import src.main.w08.ex03.Element;
import src.main.w08.ex03.StateOfMatter;

import static org.junit.jupiter.api.Assertions.*;

class ElementTest {
    Element element = new Element("Wasserstoff", -252.9f, -259.2f, 10f);

    @Test
    void testGetState() {
        assertEquals(StateOfMatter.GAS, element.getState());
    }

}