package src.w04.ex03;

public class Point {
    private int x;
    private int y;

    /** 
     * Initializes a point in x- and y-axis.
     * @param x     value in x-axis
     * @param y     value in y-axis
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /** 
     * Sets value in x-axis
     * @param x     value in x-axis
     */
    public void setX(int x) {
        this.x = x;
    }

    
    /** 
     * Sets value in y-axis
     * @param y     value in y-axis
     */
    public void setY(int y) {
        this.y = y;
    }

    
    /** 
     * Returns both coordinates summarized as a string.
     * @return {@link String}
     */
    public String stringify() {
        return "x: " + x + ", y: " + y;
    }
}
