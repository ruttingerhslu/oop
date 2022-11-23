package main.w09.ex02;

import java.util.Objects;

public final class Temperature implements Comparable<Temperature> {
    private final float kelvin;
    private final float KELVIN_OFFSET = 273.15f;

    private Temperature(float temperature, TemperatureScale scale) {
        switch (scale) {
            case KELVIN -> this.kelvin = temperature;
            case CELSIUS -> this.kelvin = convertToKelvin(temperature);
            case default -> throw new IllegalArgumentException("Temperature scale either not provided or not found");
        }
    }

    public static Temperature createFromCelsius(final float celsius) {
        if (celsius < -273.15) throw new IllegalArgumentException("Celsiuswert darf nicht unter -273.15 sein!");
        return new Temperature(celsius, TemperatureScale.CELSIUS);
    }

    public static Temperature createFromKelvin(final float kelvin) {
        if (kelvin < 0) throw new IllegalArgumentException("Kelvinwert darf nicht unter 0 sein!");
        return new Temperature(kelvin, TemperatureScale.KELVIN);
    }

    public static Temperature createFromFahrenheit() throws NotImplementedException {
        throw new NotImplementedException("Not implemented yet!");
    }

    public float getKelvin() {
        return this.kelvin;
    }

    public float getCelsius() {
        return this.convertToCelsius(getKelvin());
    }

    public boolean equals(Object o) {
        if (o instanceof Temperature) {
            return this.getKelvin() == ((Temperature) o).getKelvin();
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.getKelvin());
    }

    public String toString() {
        return getClass().getSimpleName() + "\nTemperature in celsius: " + this.getCelsius();
    }

    public int compareTo(Temperature other) {
        return Float.compare(getKelvin(), other.getKelvin());
    }

    public float convertToKelvin(float celsius) {
        return celsius + this.KELVIN_OFFSET;
    }

    public float convertToCelsius(float kelvin) {
        return kelvin - this.KELVIN_OFFSET;
    }
}
