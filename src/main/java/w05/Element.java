package w05;
/** Represents a chemical element.
 * @author Rafael Uttinger
 * @version 1.0
*/
public abstract class Element {

    public Element(double boilingPoint, double meltingPoint) {}

    public abstract double getBoilingPoint();

    public abstract double getMeltingPoint();

    public abstract String getStateOfMatter(double celsius);
}
