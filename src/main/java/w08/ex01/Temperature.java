package w08.ex01;

import java.util.Objects;

public final class Temperature implements Comparable<Temperature> {
    private float kelvin;
    private final float KELVIN_OFFSET = 273.15f;

    public Temperature(float celsius) {
        this.setCelsius(celsius);
    }

    public Temperature(Temperature temperature) {
        this.setKelvin(temperature.getKelvin());
    }

    public final float getKelvin() {
        return this.kelvin;
    }

    public float getCelsius() {
        return this.convertToCelsius(getKelvin());
    }

    public final void setKelvin(final float kelvin) {
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

    public final float convertToKelvin(float celsius) {
        return celsius + this.KELVIN_OFFSET;
    }

    public final float convertToCelsius(float kelvin) {
        return kelvin - this.KELVIN_OFFSET;
    }
}
