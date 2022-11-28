package legacy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {

    private final Demo demo = new Demo();

    @Test
    void testMaxPositive() {
        assertEquals(demo.max(1, 2), 2);
    }

    @Test
    void testMinPositive() {
        assertEquals(demo.min(1, 2), 1); 
    }
}