package main.w08.ex02;

import main.w08.ex01.Temperature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public final class TemperatureTrend {
    private final ArrayList<Temperature> temperatures;

    public TemperatureTrend(ArrayList<Temperature> temperatures) {
        this.temperatures = temperatures;
    }

    public ArrayList<Temperature> getTemperatures() {
        return temperatures;
    }

    public void add(Temperature temperature) {
        temperatures.add(temperature);
    }

    public void clear() {
        getTemperatures().clear();
    }

    public int getCount() {
        return getTemperatures().size();
    }

    public float getMaxTemperature() {
        if (!getTemperatures().isEmpty()) return Collections.max(getTemperatures()).getCelsius();
        return Float.NaN;
    }

    public float getMinTemperature() {
        if (!getTemperatures().isEmpty()) return Collections.min(getTemperatures()).getCelsius();
        return Float.NaN;
    }

    public float getAvgTemperature() {
        float sum = 0;
        for (Temperature t : getTemperatures()) {
            sum += t.getCelsius();
        }
        return sum / getCount();
    }

    public float getUniqueAvgTemperature() {
        float sum = 0;
        ArrayList<Temperature> distinctTemperatures = new ArrayList<>(getTemperatures().stream().distinct().toList());
        for (Temperature t : distinctTemperatures) {
            sum += t.getCelsius();
        }
        return sum / distinctTemperatures.size();
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
        ArrayList<Temperature> temperatures = getTemperatures();
        for (int i = 0; i < temperatures.size(); i++) {
            stringBuilder.append(i).append(": ").append(temperatures.get(i).getCelsius()).append("\n");
        }
        return this.getClass().getSimpleName() + "\n" + stringBuilder;
    }
}
