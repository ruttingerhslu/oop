package w06.ex01;

import w05.Circle;
import w05.Rectangle;
import w05.Shape;

public class Main {
    public static void main(String [] args) {
        Shape shape1 = new Circle(1, 2, 3);
        Shape shape2 = new Rectangle(1, 2, 3, 4);
        shape2.move(2, 3);
        ((Circle) shape1).getDiameter();
    }
}
