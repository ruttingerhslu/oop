package main.legacy;
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

    /**
    * Returns the physical state of the provided element name. 
    *
    * @param  elementName  name of the chemical element you want the physical state of
    * @return              state of matter in "gasförmig", "flüssig" or "fest"
    * @see                 #getStateOfMatter(Element)
    */
    public String getStateOfMatter(String elementName) {
        return switch (elementName) {
            case "N" -> this.determineState(-195.8, -210);
            case "Hg" -> this.determineState(356.7, -38.83);
            case "Pb" -> this.determineState(1749, 327.5);
            default -> "Chemical element not known.";
        };
    }

    /**
    * Returns the physical state of the provided element. 
    * @param  element   {@link Element}
    * @return           state of matter in "gasförmig", "flüssig" or "fest"
    * @see              #getStateOfMatter(String)
    */
    public String getStateOfMatter(Element element) {
        return this.determineState(element.getBoilingPoint(), element.getMeltingPoint());
    }

    private String determineState(double boilingPoint, double meltingPoint) {
        double temperature = this.getTemperature();
        if (temperature >= boilingPoint) {
            return "gasförmig";
        } else if (temperature >= meltingPoint) {
            return "flüssig";
        } else {
            return "fest";
        }
    }
}
