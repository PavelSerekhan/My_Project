package Test;

public class Overaiding {

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int min(int a, int b, int c) {
        return min(c, min(a, b));
    }

    public static int min(int a, int b, int c, int d) {
        return min(d, min(a, b, c));
    }

    public static int min(int a, int b, int c, int d, int f) {
        return min(f, min(a, b, c, d));
    }
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c) {
        return max(c, max(a, b));
    }

    public static int max(int a, int b, int c, int d) {
        return max(d, max(a, b, c));
    }

    public static int max(int a, int b, int c, int d, int f) {
        return max(f, max(a, b, c, d));
    }

}
