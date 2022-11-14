package src.main.w08.ex01;

/** Represents a chemical element.
 * @author Rafael Uttinger
 * @version 1.0
 */
public class Element {
    private double boilingPoint;
    private double meltingPoint;

    public Element(double boilingPoint, double meltingPoint) {
        if (boilingPoint > meltingPoint) {
            this.boilingPoint = boilingPoint;
            this.meltingPoint = meltingPoint;
        }
    }

    public double getBoilingPoint() {
        return boilingPoint;
    }

    public double getMeltingPoint() {
        return meltingPoint;
    }
}
