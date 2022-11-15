package test.main.w08.ex02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.w08.ex01.Temperature;
import src.main.w08.ex02.TemperatureTrend;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTrendTest {
    List<Temperature> temperatures = new ArrayList<>();
    TemperatureTrend temperatureTrend = new TemperatureTrend(temperatures);

    @BeforeEach
    void setup() {
        initializeTemperatures();
    }

    @Test
    void testAdd() {
        Temperature temperature = new Temperature(1);

        temperatureTrend.add(temperature);

        assertEquals(1, temperatureTrend.getTemperatures().get(1).getCelsius());
    }

    @Test
    void testClear() {
        temperatureTrend.clear();

        assertEquals(0, temperatureTrend.getCount());
    }

    @Test
    void testGetCount() {
        assertEquals(1, temperatureTrend.getCount());
    }

    @Test
    void testGetMaxTemperature() {
        Temperature expectedTemperature = new Temperature(10);

        temperatures.add(expectedTemperature);
        Optional<Temperature> maxTemperature = temperatureTrend.getMaxTemperature();

        assertTrue(maxTemperature.isPresent());
        assertEquals(expectedTemperature, maxTemperature.get());
    }

    void initializeTemperatures() {
        Temperature temperature = new Temperature(0);
        temperatures.add(temperature);
    }
}