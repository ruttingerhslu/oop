package src.legacy;
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
    * @see                 {@link #getStateOfMatter(Element)}
    */
    public String getStateOfMatter(String elementName) {
        switch (elementName) {
            case "N":
                return this.determineState(-195.8, -210);
            case "Hg":
                return this.determineState(356.7, -38.83);
            case "Pb":
                return this.determineState(1749, 327.5);
            default:
                return "Chemical element not known.";
        }
    }

    /**
    * Returns the physical state of the provided element. 
    * @param  element   {@link Element}
    * @return           "gasförmig", "flüssig" or "fest"
    * @see              {@link #getStateOfMatter(String)}
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
