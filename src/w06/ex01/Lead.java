package src.w06.ex01;

public class Lead extends Element {

    private double boilingPoint = 1749;
    private double meltingPoint = 327.5;

    @Override
    public double getBoilingPoint() {
        return boilingPoint;
    }

    @Override
    public double getMeltingPoint() {
        return meltingPoint;
    }

    @Override
    public String getStateOfMatter(double celsius) {
        return null;
    }

}