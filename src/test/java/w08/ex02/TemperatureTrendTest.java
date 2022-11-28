package w08.ex02;

import w09.ex02.Temperature;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureTrendTest {
    private final TemperatureTrend temperatureTrend = new TemperatureTrend();

    @Test
    void testAdd() {
        initTemperatures();
        Temperature temperature = Temperature.createFromCelsius(1);

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
        Temperature expectedTemperature = Temperature.createFromCelsius(10);

        temperatureTrend.add(expectedTemperature);
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
        Temperature expectedTemperature = Temperature.createFromCelsius(-10);

        temperatureTrend.add(expectedTemperature);
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
        Temperature highTemperature = Temperature.createFromCelsius(20);
        Temperature lowTemperature = Temperature.createFromCelsius(-5);

        temperatureTrend.add(highTemperature);
        temperatureTrend.add(lowTemperature);
        float avgTemperature = temperatureTrend.getAvgTemperature();

        assertEquals(5f, avgTemperature);
    }

    @Test
    void testGetUniqueAverageTemperature() {
        initTemperatures();
        Temperature highTemperature = Temperature.createFromCelsius(20);
        Temperature duplicateTemperature = Temperature.createFromCelsius(20);
        Temperature lowTemperature = Temperature.createFromCelsius(-5);

        temperatureTrend.add(highTemperature);
        temperatureTrend.add(duplicateTemperature);
        temperatureTrend.add(lowTemperature);
        float avgTemperature = temperatureTrend.getUniqueAvgTemperature();

        assertEquals(5f, avgTemperature);
    }

    void initTemperatures() {
        Temperature temperature = Temperature.createFromCelsius(0);
        temperatureTrend.add(temperature);
    }
}