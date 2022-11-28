package w04.ex03;

public class Line {
    private Point a;
    private Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Line(int x1, int x2, int y1, int y2) {
        this.a = new Point(x1, y1);
        this.b = new Point(x2, y2);
    }
    
    /** 
     * Returns first point as {@link Point}.
     * @return {@link Point}
     */
    public Point getPointA() {
        return new Point(a.getX(), a.getY());
    }
    
    /** 
     * Returns second point as {@link Point}.
     * @return {@link Point}
     */
    public Point getPointB() {
        return new Point(b.getX(), b.getY());
    }
    
    /** 
     * Returns both points summarized as a string.
     * @return {@link String}
     */
    public String stringify() {
        return "Point A: " + a.stringify() + ", Point B: " + b.stringify();
    }
}
