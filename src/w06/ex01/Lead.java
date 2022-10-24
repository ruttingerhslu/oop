package src.w06.ex01;

public class Lead extends Element {

    double boilingPoint;
    double meltingPoint;

    public Lead(double boilingPoint, double meltingPoint) {
        super(boilingPoint, meltingPoint);
    }

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