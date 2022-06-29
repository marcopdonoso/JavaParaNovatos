public class LuckyNumber {
    private final int dateAdded;

    LuckyNumber(int d, int m, int y) {
        this.dateAdded = d + m + y;
    }

    private int addDigits(int n) {
        int acc = 0;

        while (n != 0) {
            int digit = n % 10;
            acc += digit;
            n = n / 10;
        }
        return acc;
    }

    public int luckyGen() {
        int n = dateAdded;
        while (n / 10 != 0) {
            n = addDigits(n);
        }
        return n;
    }



}
