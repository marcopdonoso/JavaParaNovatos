package utilities.math;

public class Pow {
    public int raise (int a, int b) {
        int acc = 1;
        for (int i = 0; i < b; i++) {
            acc *= a;
        }
        return acc;
    }

    public double raise (double a, int b) {
        double acc = 1;
        for (int i = 0; i < b; i++) {
            acc *= a;
        }
        return acc;
    }
}
