package legacy;

public class Main {
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        temp.setTemperature(10);
        temp.changeCelsius(2);

        Element[] elements = new Element[2];
        elements[0] = new Element(-195.8, -210);
        elements[1] = new Element(356.7, -38.83);
        for (Element element : elements) {
            System.out.println(temp.getStateOfMatter(element));
        }

        Point[] points = new Point[5];
        points[0] = new Point(1, 2);
        points[1] = new Point(-1, 2);
        points[2] = new Point(-1, -2);
        points[3] = new Point(1, -2);
        points[4] = new Point(0, 0);
        for (Point point : points) {
            System.out.println(point.getQuadrant());
            System.out.println(point.getQuadrantv2());
        }
    }
}
