package src.main.w08.ex02;

import src.main.w08.ex01.Temperature;

import java.util.List;
import java.util.Objects;

public class TemperatureTrend {
    private final List<Temperature> temperatures;

    public TemperatureTrend(List<Temperature> temperatures) {
        this.temperatures = temperatures;
    }

    public List<Temperature> getTemperatures() {
        return temperatures;
    }

    public void add(Temperature temperature) {
        temperatures.add(temperature);
    }

    public void clear() {
        temperatures.clear();
    }

    public int getCount() {
        return temperatures.size();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof TemperatureTrend) {
            return Objects.equals(getTemperatures(), ((TemperatureTrend) o).getTemperatures());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperatures);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Temperatures: \n");
        List<Temperature> temperatures = getTemperatures();
        for (int i = 0; i < temperatures.size(); i++) {
            stringBuilder.append(i).append(": ").append(temperatures.get(i).getCelsius()).append("\n");
        }
        return this.getClass().getSimpleName() + "\n" + stringBuilder;
    }
}
