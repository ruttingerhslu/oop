package w04.ex03;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /** 
     * @param x     value in x-axis
     */
    public void setX(int x) {
        this.x = x;
    }

    
    /** 
     * @param y     value in y-axis
     */
    public void setY(int y) {
        this.y = y;
    }

    
    /** 
     * @return String
     */
    public String stringify() {
        return "x: " + x + ", y: " + y;
    }
}
