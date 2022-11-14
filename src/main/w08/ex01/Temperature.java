package src.main.w08.ex01;

public class Temperature {
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

    public final float convertToKelvin(float celsius) {
        return celsius + this.KELVIN_OFFSET;
    }

    public final float convertToCelsius(float kelvin) {
        return kelvin - this.KELVIN_OFFSET;
    }
}
