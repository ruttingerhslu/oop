package src.main.w08.ex01;

public class Temperature {
    private double celsius;

    public Temperature(double celsius) {
        this.setTemperature(celsius);
    }

    public Temperature() {
    }

    public final void setTemperature(final double celsius) {
        this.celsius = celsius;
    }

    public final double getTemperature() {
        return this.celsius;
    }

    public double getKelvin() {
        return this.getTemperature() + 273.15;
    }

    public double getFahrenheit() {
        return this.getTemperature() * 1.8 + 32;
    }

    public void changeCelsius(double value) {
        this.setTemperature(this.getTemperature() + value);
    }
}
