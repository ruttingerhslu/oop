package src.main.w08.ex03;

public class Element {
    private final String name;
    private final float boilingPoint;
    private final float meltingPoint;
    private float temperature;

    public Element(String name, float boilingPoint, float meltingPoint, float temperature) {
        if (boilingPoint > meltingPoint) {
            this.name = name;
            this.boilingPoint = boilingPoint;
            this.meltingPoint = meltingPoint;
            this.temperature = temperature;
        } else {
            throw new IllegalArgumentException("Boiling point must be greater than melting point");
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public StateOfMatter getState() {
        if (getTemperature() >= boilingPoint) {
            return StateOfMatter.GAS;
        } else if (getTemperature() >= meltingPoint) {
            return StateOfMatter.LIQUID;
        } else {
            return StateOfMatter.SOLID;
        }
    }

    public String getDescription() {
        return name + " ist bei " + getTemperature() + "°C " + getState();
    }
}
