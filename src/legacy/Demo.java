package src.legacy;
import java.lang.Math;

public class Demo {
    public Demo() {
    }

    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public int min(int a, int b) {
        return Math.min(a, b);
    }
}
