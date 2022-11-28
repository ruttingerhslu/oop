package w09.ex02;

import java.util.Objects;

public final class Temperature implements Comparable<Temperature> {
    private final float kelvin;
    static final float KELVIN_OFFSET = 273.15f;

    private Temperature(float temperature, TemperatureScale scale) {
        switch (scale) {
            case KELVIN -> this.kelvin = temperature;
            case CELSIUS -> this.kelvin = convertToKelvin(temperature);
            case default -> throw new IllegalArgumentException("Temperature scale either not provided or not found");
        }
    }

    public static Temperature createFromCelsius(final float celsius) {
        checkCelsius(celsius);
        return new Temperature(celsius, TemperatureScale.CELSIUS);
    }

    public static Temperature createFromKelvin(final float kelvin) {
        checkKelvin(kelvin);
        return new Temperature(kelvin, TemperatureScale.KELVIN);
    }

    public float getKelvin() {
        return this.kelvin;
    }

    public float getCelsius() {
        return convertToCelsius(getKelvin());
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

    public static float convertToKelvin(float celsius) {
        checkCelsius(celsius);
        return celsius + KELVIN_OFFSET;
    }

    public static float convertToCelsius(float kelvin) {
        checkKelvin(kelvin);
        return kelvin - KELVIN_OFFSET;
    }

    public static void checkKelvin(float kelvin) {
        if (kelvin < 0) throw new IllegalArgumentException("Kelvin value can't be under 0!");
    }

    public static void checkCelsius(float celsius) {
        if (celsius < -KELVIN_OFFSET) throw new IllegalArgumentException("Celsius value can't be under -273.15!");
    }
}
