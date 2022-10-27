package src.main.w04.ex03;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(1, 3);
        Point b = new Point(2, 5);
        Line x = new Line(a, b);

        x.getPointA().setX(4);
        System.out.println(String.valueOf(x.getPointA().stringify()));
        System.out.println(x.stringify());
    }
}
