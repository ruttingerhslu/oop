package test.main.w08.ex01;

import org.junit.jupiter.api.Test;
import src.main.w08.ex01.Element;

import static org.junit.jupiter.api.Assertions.*;

class ElementTest {
    Element element = new Element(5, 2);

    @Test
    void testGetBoilingPoint() {
        assertEquals(5, element.getBoilingPoint());
    }

    @Test
    void testGetMeltingPoint() {
        assertEquals(2, element.getMeltingPoint());
    }
}