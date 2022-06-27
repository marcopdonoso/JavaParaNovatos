public class Factorial {
    private final long number;

    public Factorial(long number) {
        this.number = Math.abs(number);
    }

    public long factorialCalc() {
        long factorial = 1;
        if (number != 0 && number != 1) {
            for (long i = number; i > 0; i--) {
                factorial *= i;
            }
        }
        return factorial;
    }
}
