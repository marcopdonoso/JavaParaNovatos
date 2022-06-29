public class Fibonacci {
    private final int[] succession;

    Fibonacci(int n) {
        if (n == 0) {
            this.succession = new int[1];
        } else {
            this.succession = new int[n];
        }
    }

    public int[] makeFibonacci() {
        if (succession.length == 1) {
            succession[0] = 0;
        } else {
            succession[0] = 0;
            succession[1] = 1;
            for (int i = 2; i < succession.length; i++) {
                succession[i] = succession[i-2] + succession[i-1];
            }
        }
        return succession;
    }
}
