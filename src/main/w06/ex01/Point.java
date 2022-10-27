package src.main.w06.ex01;

public class Point {
    private int x;
    private int y;

    /** 
     * Initializes a point in x- and y-axis.
     * @param x     value in x-axis
     * @param y     value in y-axis
     */
    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    /** 
     * Initializes a point with provided point
     * @param point     value as {@link Point}
     */
    public Point(Point point) {
        setX(point.getX());
        setY(point.getY());
    }
    
    /** 
     * Sets value in x-axis
     * @param x     value in x-axis
     */
    public void setX(int x) {
        this.x = x;
    }

    /** 
     * Gets value of x-axis
     */
    public int getX() {
        return x;
    }
    
    /** 
     * Sets value in y-axis
     * @param y     value in y-axis
     */
    public void setY(int y) {
        this.y = y;
    }

    /** 
     * Gets value of y-axis
     */
    public int getY() {
        return y;
    }

    /**
     * Move {@link Point} relative to provided x- and y-axises
     * @param x     value in x-axis
     * @param y     value in y-axis
     */
    public void moveRelative(int x, int y) {
        setX(getX() + x);
        setY(getY() + y);
    }

    /**
     * Move {@link Point} relative to provided x- and y-axises
     * @param vectorPoint   vector in {@link Point}
     */
    public void moveRelative(Point vectorPoint) {
        setX(getX() + vectorPoint.getX());
        setY(getY() + vectorPoint.getY());
    }

    /**
     * Move {@link Point} relative to provided polar coordinates (distance and angle)
     * @param distance   distance from current Point to new Point
     * @param angle      angle relative to new Point
     */
    public void moveRelative(int distance, double angle) {
        setX((int)(distance * Math.cos(angle)));
        setY((int)(distance * Math.sin(angle)));
    }
    
    /** 
     * Returns both coordinates summarized as a string.
     * @return {@link String}
     */
    public String stringify() {
        return "x: " + x + ", y: " + y;
    }
}
