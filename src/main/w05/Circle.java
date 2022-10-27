package src.main.w05;

public class Circle extends Shape {

    private int radius;

    public Circle(final int x, final int y, final int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public int getPerimeter() {
        return (int) (2*radius*Math.PI);
    }

    @Override
    public int getArea() {
        return (int) (Math.pow(radius, 2)*Math.PI);
    }

}
