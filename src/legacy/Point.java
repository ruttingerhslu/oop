package src.legacy;
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getQuadrant() {
        if (!(x == 0 && y == 0)) {
            if (x > 0) {
                return y > 0 ? 1 : 4;
            } else {
                return y > 0 ? 2 : 3;
            }
        }
        return 0;
    }

    public int getQuadrantv1() {
        if (!(x == 0 && y == 0)) {
            if (x > 0) {
                if (y > 0) {
                    return 1;
                } else {
                    return 4;
                }
            } else {
                if (y > 0) {
                    return 2;
                } else {
                    return 3;
                }
            }
        }
        return 0;
    }

    public int getQuadrantv2() {
        return !(x == 0 && y == 0) ? x > 0 ? y > 0 ? 1 : 4 : y > 0 ? 2 : 3 : 0;
    }
}
