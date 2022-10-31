package src.main.w06.ex03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    public final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        int input1 = 1;
        int input2 = 3;

        int result = calculator.addition(input1, input2);

        assertEquals(result, 4);
    }

    @Test
    void testAdditionNegative() {
        assertEquals(calculator.addition(-1, -3), -4);
    }

    @Test
    void testAdditionMax() {
        assertEquals(2*Integer.MAX_VALUE, calculator.addition(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    void testAdditionMaxNegative() {
        assertEquals(-(2 * Integer.MAX_VALUE), calculator.addition(-Integer.MAX_VALUE, -Integer.MAX_VALUE));
    }
}