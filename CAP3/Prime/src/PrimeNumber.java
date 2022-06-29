public class PrimeNumber {
    int counter;

    public boolean primeDet(int number) {
        int divCounter = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divCounter++;
            }
        }
        return divCounter <= 2 && number != 1;
    }

    public void eratosthenesSieve() {
        counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (primeDet(i)) {
                nicePrint(i);
            }
        }
    }

    public boolean omirpDet(int number) {
        return primeDet(invNum(number)) && primeDet(number);
    }

    public int invNum(int number) {
        int numInv = 0;

        do {
            numInv = numInv * 10 + number % 10;
            number /= 10;
        } while (number / 10 != 0);

        numInv = numInv * 10 + number % 10;

        return numInv;
    }

    public void emirpList(int emirpLimit) {
        counter = 0;
        for (int i = 1; i <= emirpLimit; i++) {
            if (omirpDet(i)) {
                nicePrint(i);
            }
        }
    }

    public void nicePrint(int i) {
        counter++;
        if (counter % 19 == 0) {
            System.out.println(i);
        } else if (i / 10 == 0) {
            System.out.print(i + "    ");
        } else if (i / 100 == 0) {
            System.out.print(i + "   ");
        } else {
            System.out.print(i + "  ");
        }
    }
}
