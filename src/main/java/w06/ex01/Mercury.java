package w06.ex01;

public class Mercury extends Element {

    private double boilingPoint = 356.7;
    private double meltingPoint = -38.83;

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

    @Override
    public String toString() {
        return super.toString() + "\nGIFTIG!";
    }


}