package w06.ex01;

public class Nitrogen extends Element {

    private double boilingPoint = -195.8;
    private double meltingPoint = -210;

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