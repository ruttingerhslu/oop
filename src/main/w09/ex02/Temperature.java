package main.w09.ex02;

import java.util.Objects;

public final class Temperature implements Comparable<Temperature> {
    private float kelvin;
    private final float KELVIN_OFFSET = 273.15f;

    public Temperature(float temperature, TemperatureScale scale) {
        switch (scale) {
            case KELVIN -> this.setKelvin(temperature);
            case CELSIUS -> this.setCelsius(temperature);
        }
    }

    public static Temperature createFromCelsius(final float celsius) {
        return new Temperature(celsius, TemperatureScale.CELSIUS);
    }

    public static Temperature createFromKelvin(final float kelvin) {
        return new Temperature(kelvin, TemperatureScale.KELVIN);
    }

    public float getKelvin() {
        return this.kelvin;
    }

    public float getCelsius() {
        return this.convertToCelsius(getKelvin());
    }

    public void setKelvin(final float kelvin) {
        this.kelvin = kelvin;
    }

    public void setCelsius(float celsius) {
        this.setKelvin(convertToKelvin(celsius));
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
