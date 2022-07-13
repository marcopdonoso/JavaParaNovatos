import java.util.Arrays;

public class GiantInteger {

    private final int[] giantNumber;
    private final int maxSize = 50;

    public GiantInteger() {
        giantNumber = new int[maxSize];
        Arrays.fill(giantNumber, 0);
    }

    public void readGiantNumber(String numberS) {
        int pointer = maxSize - 1;
        for (int i = numberS.length() - 1; i >= 0 ; i--) {
            giantNumber[pointer] = numberS.charAt(i) - 48;
            pointer--;
        }
    }

    public void printGiantNumber() {
        for (int i : giantNumber) {
            System.out.print(i);
        }
    }

    public GiantInteger add(GiantInteger giantInteger) {
        GiantInteger giantIntegerResult = new GiantInteger();
        int overflow = 0;
        int partialResult;

        for (int i = maxSize - 1; i >= 0 ; i--) {
            partialResult = giantNumber[i] + giantInteger.getDigit(i) + overflow;
            if (partialResult >= 10) {
                giantIntegerResult.setDigit(partialResult - 10, i);
                overflow = 1;
            } else {
                giantIntegerResult.setDigit(partialResult, i);
                overflow = 0;
            }
        }
        return giantIntegerResult;
    }

    public int getDigit(int index) {
        return giantNumber[index];
    }

    public void setDigit(int value, int index) {
        giantNumber[index] = value;
    }
}
