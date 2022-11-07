package src.main.w06.ex03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    public final Calculator calculator = new Calculator();

    @Test
    void testAdditionPositive() {
        assertEquals(calculator.addition(1, 3), 4);
    }

    @Test
    void testAdditionNegative() {
        assertEquals(calculator.addition(-1, -3), -4);
    }

    @Test
    void testAdditionMax() {
        assertEquals(2147483648L, calculator.addition(Integer.MAX_VALUE, 1));
    }

    @Test
    void testAdditionMaxNegative() {
        assertEquals(-2147483648L, calculator.addition(-Integer.MAX_VALUE, -1));
    }
}