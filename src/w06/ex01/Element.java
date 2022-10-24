package src.w06.ex01;
/** Represents a chemical element.
 * @author Rafael Uttinger
 * @version 1.0
*/
public abstract class Element {

    public abstract double getBoilingPoint();

    public abstract double getMeltingPoint();

    public abstract String getStateOfMatter(double celsius);

    @Override
    public String toString() {
        return "Boiling point: " + getBoilingPoint() + "\nMelting point:" + getMeltingPoint();
    }

}
