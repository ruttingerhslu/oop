package test.main.w08.ex02;

import org.junit.jupiter.api.Test;
import src.main.w08.ex01.Temperature;
import src.main.w08.ex02.TemperatureTrend;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTrendTest {
    ArrayList<Temperature> temperatures = new ArrayList<>();
    TemperatureTrend temperatureTrend = new TemperatureTrend(temperatures);

    @Test
    void testAdd() {
        initTemperatures();
        Temperature temperature = new Temperature(1);

        temperatureTrend.add(temperature);

        assertEquals(1, temperatureTrend.getTemperatures().get(1).getCelsius());
    }

    @Test
    void testClear() {
        initTemperatures();
        temperatureTrend.clear();

        assertEquals(0, temperatureTrend.getCount());
    }

    @Test
    void testGetCount() {
        initTemperatures();
        assertEquals(1, temperatureTrend.getCount());
    }

    @Test
    void testGetMaxTemperature() {
        initTemperatures();
        Temperature expectedTemperature = new Temperature(10);

        temperatures.add(expectedTemperature);
        float maxTemperature = temperatureTrend.getMaxTemperature();

        assertEquals(10f, maxTemperature);
    }

    @Test
    void testGetMaxTemperatureEmpty() {
        assertEquals(0, temperatureTrend.getMaxTemperature());
    }

    @Test
    void testGetMinTemperature() {
        initTemperatures();
        Temperature expectedTemperature = new Temperature(-10);

        temperatures.add(expectedTemperature);
        float minTemperature = temperatureTrend.getMinTemperature();

        assertEquals(-10f, minTemperature);
    }

    @Test
    void testGetMinTemperatureEmpty() {
        assertEquals(0, temperatureTrend.getMinTemperature());
    }

    @Test
    void testGetAverageTemperature() {
        initTemperatures();
        Temperature highTemperature = new Temperature(20);
        Temperature lowTemperature = new Temperature(-5);

        temperatures.add(highTemperature);
        temperatures.add(lowTemperature);
        float avgTemperature = temperatureTrend.getAvgTemperature();

        assertEquals(5f, avgTemperature);
    }

    @Test
    void testGetUniqueAverageTemperature() {
        initTemperatures();
        Temperature highTemperature = new Temperature(20);
        Temperature duplicateTemperature = new Temperature(20);
        Temperature lowTemperature = new Temperature(-5);

        temperatures.add(highTemperature);
        temperatures.add(duplicateTemperature);
        temperatures.add(lowTemperature);
        float avgTemperature = temperatureTrend.getUniqueAvgTemperature();

        assertEquals(5f, avgTemperature);
    }

    void initTemperatures() {
        Temperature temperature = new Temperature(0);
        temperatures.add(temperature);
    }
}